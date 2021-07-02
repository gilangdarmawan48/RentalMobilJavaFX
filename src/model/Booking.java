package model;

import javafx.beans.property.SimpleStringProperty;

public class Booking {
    private SimpleStringProperty nama, kodemobil, sewahari;

    public Booking(String nama, String kodemobil, String sewahari) {
        this.nama = new SimpleStringProperty(nama);
        this.kodemobil = new SimpleStringProperty(kodemobil);
        this.sewahari = new SimpleStringProperty(sewahari);
    }

    public String getNama() {
        return nama.get();
    }

    public SimpleStringProperty namaProperty() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama.set(nama);
    }

    public String getKodemobil() {
        return kodemobil.get();
    }

    public SimpleStringProperty kodemobilProperty() {
        return kodemobil;
    }

    public void setKodemobil(String kodemobil) {
        this.kodemobil.set(kodemobil);
    }

    public String getSewahari() {
        return sewahari.get();
    }

    public SimpleStringProperty sewahariProperty() {
        return sewahari;
    }

    public void setSewahari(String sewahari) {
        this.sewahari.set(sewahari);
    }
}
