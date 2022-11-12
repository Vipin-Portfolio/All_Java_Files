package model;

public class Train {
    private static int trainCode = 2022000;
    private String destination;
    private String arrival;
    private int seats;

    public static int getTrainCode() {
        return ++trainCode;
    }

    public static void setTrainCode(int trainCode) {
        Train.trainCode = trainCode;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Train(String destination, String arrival, int seats) {
        super();
        this.destination = destination;
        this.arrival = arrival;
        this.seats = seats;
        setTrainCode(trainCode);
    }
    public Train(){

    }

    @Override
    public String toString() {
        return "Train{" +
                "trainCode ='" + trainCode +'\''+
                "destination='" + destination + '\'' +
                ", arrival='" + arrival + '\'' +
                ", seats=" + seats +
                '}';
    }
}
