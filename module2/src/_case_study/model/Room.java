package _case_study.model;

public class Room extends Facility {
    private String extraService;

    public Room() {
    }

    public Room(String idService,String name_service, double area, int cost,
                int numberOfPeople, String rentalType, String extraService) {
        super(idService,name_service, area, cost, numberOfPeople, rentalType);
        this.extraService = extraService;
    }

    public String getExtraService() {
        return extraService;
    }

    public void setExtraService(String extraService) {
        this.extraService = extraService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "extraService=" + extraService +
                '}'+super.toString();
    }
    public String getRoomString(){
        return super.getFacilityString()+","+this.getExtraService();
    }
}
