package _case_study.model;

public class House extends Facility{
    private String houseStandar;
    private int numberOfFloor;

    public House() {
    }

    public House(String idService,String name_service, double area, int cost, int numberOfPeople, String rentalType, String houseStandar, int numberOfFloor) {
        super(idService,name_service, area, cost, numberOfPeople, rentalType);
        this.houseStandar = houseStandar;
        this.numberOfFloor = numberOfFloor;
    }

    public String getHouseStandar() {
        return houseStandar;
    }

    public void setHouseStandar(String houseStandar) {
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
