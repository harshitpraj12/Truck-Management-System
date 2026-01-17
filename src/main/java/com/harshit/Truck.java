package com.harshit;

public class Truck {
    private int id;
    private String company;
    private String model;
    private int TNumber;
    private String driver;

    public Truck(String company, String model, int TNumber, String driver) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.TNumber = TNumber;
        this.driver = driver;
    }

    public Truck() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTNumber() {
        return TNumber;
    }

    public void setTNumber(int TNumber) {
        this.TNumber = TNumber;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", TNumber=" + TNumber +
                ", driver='" + driver + '\'' +
                '}';
    }
}
