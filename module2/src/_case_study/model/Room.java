package _case_study.model;

public class Room extends Facility {
    private ExtraService extraService;

    public Room() {
    }

    public Room(String idService,String name_service, double area, int cost, int numberOfPeople, RentalType rentalType, ExtraService extraService) {
        super(idService,name_service, area, cost, numberOfPeople, rentalType);
        this.extraService = extraService;
    }

    public ExtraService getExtraService() {
        return extraService;
    }

    public void setExtraService(ExtraService extraService) {
        this.extraService = extraService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "extraService=" + extraService +
                '}';
    }
    public String getRoomString(){
        return super.getFacilityString()+","+this.getExtraService();
    }
}
