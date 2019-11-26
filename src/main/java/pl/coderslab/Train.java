package pl.coderslab;

public class Train extends  Vehicle {

    public Train(Integer maxSpeed, String model, int trackWidth) {
        super(maxSpeed, model);
        this.trackWidth = trackWidth;
    }

    public int trackWidth;

    public int getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
    }
}
