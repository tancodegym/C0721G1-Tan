package _case_study.model;

abstract class Facility {
private String nameService;
private double area;
private int cost;
private int numberOfPeople;
private RentalType rentalType;
    public Facility(String name_service, double area, int cost, int numberOfPeople, RentalType rentalType) {
        this.nameService = name_service;
        this.area = area;
        this.cost = cost;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public Facility() {
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
                "nameService='" + nameService + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentalType=" + rentalType +
                '}';
    }
}
class RentalType{
    private String rentalType;

    public RentalType() {
    }

    public RentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "RentalType{" +
                "rentalType='" + rentalType + '\'' +
                '}';
    }
}
class RoomStandar{
    private String roomStandar;

    public RoomStandar() {
    }

    public RoomStandar(String roomStandar) {
        this.roomStandar = roomStandar;
    }

    public String getRoomStandar() {
        return roomStandar;
    }

    public void setRoomStandar(String roomStandar) {
        this.roomStandar = roomStandar;
    }

    @Override
    public String toString() {
        return "RoomStandar{" +
                "roomStandar='" + roomStandar + '\'' +
                '}';
    }
}