package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Car;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private GridPane carGrid;
    private List<Car> cars;


    @FXML
    private Button sportCar;

    @FXML
    private Button famlyCar;

    @FXML
    private Button offraodCar;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        if(event.getSource() == sportCar){
            sportcar();
        }else if (event.getSource() == famlyCar){
            famlycar();
        }else if(event.getSource() == offraodCar){
            offradcar();
        }

    }

    public void handleBooking(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/views/Booking.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sportcar();
        famlycar();
        offradcar();
    }

    private void sportcar() {
        cars = new ArrayList<>(datacarsport());
        int columns = 0;
        int row = 1;

        try{
            for(int i = 0; i < cars.size(); i++){
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/views/car.fxml"));

                VBox carBox = fxmlLoader.load();

                CarController carController = fxmlLoader.getController();
                carController.setData(cars.get(i));

                if(columns == 3){
                    columns = 0;
                    ++row;
                }

                carGrid.add(carBox, columns++, row);
                GridPane.setMargin(carBox, new Insets(10));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private void famlycar() {
        cars = new ArrayList<>(datacarfamly());
        int columns = 0;
        int row = 1;

        try{
            for(int i = 0; i < cars.size(); i++){
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/views/car.fxml"));

                VBox carBox = fxmlLoader.load();

                CarController carController = fxmlLoader.getController();
                carController.setData(cars.get(i));

                if(columns == 3){
                    columns = 0;
                    ++row;
                }

                carGrid.add(carBox, columns++, row);
                GridPane.setMargin(carBox, new Insets(10));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private void offradcar() {
        cars = new ArrayList<>(datacaroffroad());
        int columns = 0;
        int row = 1;

        try{
            for(int i = 0; i < cars.size(); i++){
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/views/car.fxml"));

                VBox carBox = fxmlLoader.load();

                CarController carController = fxmlLoader.getController();
                carController.setData(cars.get(i));

                if(columns == 3){
                    columns = 0;
                    ++row;
                }

                carGrid.add(carBox, columns++, row);
                GridPane.setMargin(carBox, new Insets(10));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private List<Car> datacarsport(){
        List<Car> ls = new ArrayList<>();

        Car cars = new Car();
        cars.setImgSrc("/img/sport/2020-chevrolet-corvette-c8-102-1571146873.jpg");
        cars.setName("Chevrolet Corvette C8");
        cars.setPrice("$100/day");
        cars.setKode("Kode Mobil : ms1");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/sport/2020-ferrari-f8-spyder-112-1593551723.jpg");
        cars.setName("Ferrari f8 spyder");
        cars.setPrice("$150/day");
        cars.setKode("Kode Mobil : ms2");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/sport/2021-bmw-z4-mmp-1-1599583762.jpg");
        cars.setName("bmw z4 mmp");
        cars.setPrice("$100/day");
        cars.setKode("Kode Mobil : ms3");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/sport/2021-chevrolet-camaro-zl1-mmp-1-1604071262.jpg");
        cars.setName("Chevrolet Camaro zl1");
        cars.setPrice("$100/day");
        cars.setKode("Kode Mobil : ms4");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/sport/2021-ford-mustang-mach-1-109-1592231891.jpg");
        cars.setName("Ford Mustang mach");
        cars.setPrice("$100/day");
        cars.setKode("Kode Mobil : ms5");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/sport/2021-mazda-mx-5-miata-mmp-1-1593459650.jpg");
        cars.setName("Mazda mx 5 miata mmp ");
        cars.setPrice("$120/day");
        cars.setKode("Kode Mobil : ms6");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/sport/2021-mercedes-amg-gt-black-series-118-1601842340.jpg");
        cars.setName("Mercedes amg gt");
        cars.setPrice("$140/day");
        cars.setKode("Kode Mobil : ms7");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/sport/2021-porsche-718-cayman-mmp-1-1593003156.jpg");
        cars.setName("Porsche 718 cayman");
        cars.setPrice("$140/day");
        cars.setKode("Kode Mobil : ms8");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/sport/2021-toyota-supra-3p0-105-1597436187.jpg");
        cars.setName("Toyota Supra");
        cars.setPrice("$140/day");
        cars.setKode("Kode Mobil : ms9");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/sport/mclaren-765lt-101-1583186188.jpg");
        cars.setName("Mclaren");
        cars.setPrice("$150/day");
        cars.setKode("Kode Mobil : ms10");
        ls.add(cars);

        return ls;
    }

    private List<Car> datacarfamly(){
        List<Car> ls = new ArrayList<>();

        Car cars = new Car();
        cars.setImgSrc("/img/famly/2017-mercedes-benz-e-class-wagon.jpg");
        cars.setName("Mercedes-benz e class wagon");
        cars.setPrice("$60/day");
        cars.setKode("Kode Mobil : mk1");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/famly/2018-Chrysler-Pacifica-Hybrid-Main-Art.jpg");
        cars.setName("Chrysler Pacifica Hybrid");
        cars.setPrice("$40/day");
        cars.setKode("Kode Mobil : mk2");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/famly/2018-Ford-Explorer.jpg");
        cars.setName("Ford Explorer");
        cars.setPrice("$60/day");
        cars.setKode("Kode Mobil : mk3");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/famly/2018-Ford-Transit-Connect.jpg");
        cars.setName("Ford Transit Connect");
        cars.setPrice("$70/day");
        cars.setKode("Kode Mobil : mk4");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/famly/2019_Honda_Accord_049.jpg");
        cars.setName("Honda Accord");
        cars.setPrice("$50/day");
        cars.setKode("Kode Mobil : mk5");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/famly/2019-honda-fit.jpg");
        cars.setName("Honda fit");
        cars.setPrice("$30/day");
        cars.setKode("Kode Mobil : mk6");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/famly/2019-Hyundai-Kona-Electric-Profile.jpg");
        cars.setName("Hyundai Kona");
        cars.setPrice("$30/day");
        cars.setKode("Kode Mobil : mk7");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/famly/2019-Ram-1500-eTorque-Main-Art.jpg");
        cars.setName("Ram 1500 eTorque");
        cars.setPrice("$40/day");
        cars.setKode("Kode Mobil : mk8");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/famly/2019-Subaru-Ascent-Review-main.jpg");
        cars.setName("Subaru Ascent");
        cars.setPrice("$30/day");
        cars.setKode("Kode Mobil : mk9");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/famly/Kia-Stinger-GTS-Main-Art.jpg");
        cars.setName("Kia StingerGTS");
        cars.setPrice("$30/day");
        cars.setKode("Kode Mobil : mk10");
        ls.add(cars);

        return ls;
    }

    private List<Car> datacaroffroad(){
        List<Car> ls = new ArrayList<>();

        Car cars = new Car();
        cars.setImgSrc("/img/offroad/chevrolet-colorado-zr2-bison-768x768.jpg");
        cars.setName("chevrolet colorado zr2 bison");
        cars.setPrice("$80/day");
        cars.setKode("Kode Mobil : mo1");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/offroad/ford-f-150-raptor-4-768x768.jpg");
        cars.setName("ford f 150 raptor");
        cars.setPrice("$70/day");
        cars.setKode("Kode Mobil : mo2");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/offroad/ford-ranger-performance-3-768x768.jpg");
        cars.setName("ford ranger");
        cars.setPrice("$70/day");
        cars.setKode("Kode Mobil : mo3");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/offroad/jeep-gladiator-rubicon-768x768.jpg");
        cars.setName("jeep gladiator rubicon");
        cars.setPrice("$90/day");
        cars.setKode("Kode Mobil : mo4");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/offroad/jeep-wrangler-rubicon-768x768.jpg");
        cars.setName("jeep wrangler rubicon");
        cars.setPrice("$90/day");
        cars.setKode("Kode Mobil : mo5");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/offroad/land-rover-defender-2-768x768.jpg");
        cars.setName("land rover defender");
        cars.setPrice("$60/day");
        cars.setKode("Kode Mobil : mo6");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/offroad/mercedes-benz-g-class-768x768.jpg");
        cars.setName("mercedes-benz g");
        cars.setPrice("$50/day");
        cars.setKode("Kode Mobil : mo7");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/offroad/toyota-4runner-trd-pro-768x768.jpg");
        cars.setName("toyota 4runner trd pro");
        cars.setPrice("$60/day");
        cars.setKode("Kode Mobil : mo8");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/offroad/toyota-land-cruiser-768x768.jpg");
        cars.setName("toyota land cruiser");
        cars.setPrice("$60/day");
        cars.setKode("Kode Mobil : mo9");
        ls.add(cars);

        cars = new Car();
        cars.setImgSrc("/img/offroad/toyota-tacoma-trd-pro-768x768.jpg");
        cars.setName("toyota tacoma trd pro");
        cars.setPrice("$600/day");
        cars.setKode("Kode Mobil : mo10");
        ls.add(cars);

        return ls;
    }
}
