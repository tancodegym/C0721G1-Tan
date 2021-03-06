package _case_study.model;

public class Villa extends Facility {
    private String villaStandar;
    private double poolArea;
    private int numberOfFloor;

    public Villa() {
    }
    public Villa(String idService, String name_service, double area, int cost,
                 int numberOfPeople, String rentalType, String villaStandar,
                 double poolArea, int numberOfFloor) {
        super(idService,name_service, area, cost, numberOfPeople, rentalType);
        this.villaStandar = villaStandar;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public String getVillaStandar() {
        return villaStandar;
    }

    public void setVillaStandar(String villaStandar) {
        this.villaStandar = villaStandar;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "villaStandar=" + villaStandar +
                ", poolArea=" + poolArea +
                ", numberOfFloor=" + numberOfFloor +
                '}'+super.toString();
    }

    public String getVillaString(){
        return super.getFacilityString()+","+this.getVillaStandar()+","+this.getPoolArea()+","+this.getNumberOfFloor();
    }
}
