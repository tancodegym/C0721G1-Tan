package _case_study.model;

import java.io.Serializable;

public abstract class Facility implements Serializable {
    private String idService;
private String nameService;
private double area;
private int cost;
private int numberOfPeople;
private RentalType rentalType;
    public Facility(String idService,String name_service, double area, int cost, int numberOfPeople, RentalType rentalType) {
        this.idService=idService;
        this.nameService = name_service;
        this.area = area;
        this.cost = cost;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public Facility() {
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public RentalType getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idService='" + idService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentalType=" + rentalType +
                '}';
    }

    public String getFacilityString(){
        return this.getIdService()+","+this.getNameService()+","+this.getArea()+","+this.getCost()+","+this.getNumberOfPeople()+","+this.getRentalType();

    }
}

