package _case_study.model;

public class ExtraService {
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
    public String toString() {
        return "ExtraService{" +
                "extraService='" + extraService + '\'' +
                '}';
    }
}
