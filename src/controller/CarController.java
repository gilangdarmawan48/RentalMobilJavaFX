package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Car;

public class CarController {
    @FXML
    private ImageView carImg;

    @FXML
    private Label carName;

    @FXML
    private Label carPrice;

    @FXML
    private Label carKode;


    public void setData(Car car){
        Image image = new Image(getClass().getResourceAsStream(car.getImgSrc()));
        carImg.setImage(image);
        carName.setText(car.getName());
        carPrice.setText(car.getPrice());
        carKode.setText(car.getKode());
    }
}
