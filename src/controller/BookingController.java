package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Callback;
import model.Booking;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class BookingController implements Initializable {
    @FXML
    private TextField tfNama;

    @FXML
    private TextField tfKodemobil;

    @FXML
    private TextField tfsewahari;

    @FXML
    private TableView<Booking> tvDataSewa;

    @FXML
    private TableColumn<Booking, String> colNama;

    @FXML
    private TableColumn<Booking, String> colKodemobil;

    @FXML
    private TableColumn<Booking, String> colSewahari;

    @FXML
    private Button btnSewa;

    @FXML
    private Button btnKembali;

    @FXML
    private void handleSewa(ActionEvent event) {
        String nama = tfNama.getText();
        String kodemobil = tfKodemobil.getText();
        String sewahari = tfsewahari.getText();

        try {
            FileWriter bw = new FileWriter("datasewa.txt",true);
            bw.write(nama + ";" + kodemobil + ";" + sewahari + ";"+ "\n");
            bw.close();
        } catch (IOException ex) {
            System.out.println("file sudah ada");
        }
    }

    @FXML
    private void handleKembali(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("/views/rentalmobil.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    private void handleRefresh(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/views/Booking.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        showdata();
    }

    private final ObservableList<Booking> datalist = FXCollections.observableArrayList();
    private void showdata(){

        colNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        colKodemobil.setCellValueFactory(new PropertyValueFactory<>("kodemobil"));
        colSewahari.setCellValueFactory(new PropertyValueFactory<>("sewahari"));

        tvDataSewa.setItems(datalist);
        tvDataSewa.getColumns().addAll(colNama, colKodemobil, colSewahari);

        read();
    }

    private void read(){
        String filename = "datasewa.txt";
        String pemisah = ";";

        BufferedReader br;

        try{
            br = new BufferedReader(new FileReader(filename));

            String line;
            while((line = br.readLine()) != null){
                String[] fileds = line.split(pemisah, -1);

                Booking booking = new Booking(fileds[0], fileds[1], fileds[2]);
                datalist.add(booking);
            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }


}
