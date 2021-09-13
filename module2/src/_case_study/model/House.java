package _case_study.model;

public class House extends Facility{
    private RoomStandar houseStandar;
    private int numberOfFloor;

    public House() {
    }

    public House(String idService,String name_service, double area, int cost, int numberOfPeople, RentalType rentalType, RoomStandar houseStandar, int numberOfFloor) {
        super(idService,name_service, area, cost, numberOfPeople, rentalType);
        this.houseStandar = houseStandar;
        this.numberOfFloor = numberOfFloor;
    }

    public RoomStandar getHouseStandar() {
        return houseStandar;
    }

    public void setHouseStandar(RoomStandar houseStandar) {
        this.houseStandar = houseStandar;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseStandar=" + houseStandar +
                ", numberOfFloor=" + numberOfFloor +
                '}'+super.toString();
    }

    public String getHouseString(){
        return super.getFacilityString()+","+this.getHouseStandar()+","+this.getNumberOfFloor();
    }
}
