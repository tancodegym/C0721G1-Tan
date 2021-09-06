package _case_study.model;

public class Room extends Facility {
    private ExtraService extraService;

    public Room() {
    }

    public Room(String name_service, double area, int cost, int numberOfPeople, RentalType rentalType, ExtraService extraService) {
        super(name_service, area, cost, numberOfPeople, rentalType);
        this.extraService = extraService;
    }

    public ExtraService getExtraService() {
        return extraService;
    }

    public void setExtraService(ExtraService extraService) {
        this.extraService = extraService;
    }
    @Override
    public String toString(){
        return "Room with free service included : "+extraService+
                super.toString();
    }
}
class ExtraService{
    private String extraService;

    public ExtraService() {
    }
    public ExtraService(String extraService) {
        this.extraService = extraService;
    }
    public String getExtraService() {
        return extraService;
    }
    public void setExtraService(String extraService) {
        this.extraService = extraService;
    }
    @Override
    public String toString(){
        return "Extra service : "+extraService;
    }
}
