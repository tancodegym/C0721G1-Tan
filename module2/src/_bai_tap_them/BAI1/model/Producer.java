package _bai_tap_them.BAI1.model;

public class Producer {
    private String producerCode;
    private String nameOfProducer;
    private String country;

    public Producer() {
    }

    public Producer(String producerCode, String nameOfProducer, String country) {
        this.producerCode = producerCode;
        this.nameOfProducer = nameOfProducer;
        this.country = country;
    }

    public String getProducerCode() {
        return producerCode;
    }

    public void setProducerCode(String producerCode) {
        this.producerCode = producerCode;
    }

    public String getNameOfProducer() {
        return nameOfProducer;
    }

    public void setNameOfProducer(String nameOfProducer) {
        this.nameOfProducer = nameOfProducer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "producerCode='" + producerCode + '\'' +
                ", nameOfProducer='" + nameOfProducer + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
    public String getString(){
        return getProducerCode()+","+getNameOfProducer()+","+getCountry();
    }
}
