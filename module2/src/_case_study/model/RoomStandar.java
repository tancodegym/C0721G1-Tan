package _case_study.model;

public class RoomStandar {

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

