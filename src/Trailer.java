//Trailer Class, DO NOT CHANGE!

public class Trailer {
    private double lightQuality;
    private double roomQuality;
    private int capacity;

    //Trailer constructor, receives information about capacity, light quality, and room quality
    public Trailer(int c, double l, double r){
        capacity = c;
        lightQuality = l;
        roomQuality = r;
    }

    //Set light quality
    public void setLightQuality(double l){
        lightQuality = l;
    }

    //Get light quality
    public double getLightQuality(){
        return lightQuality;
    }

    //Get capacity
    public int getCapacity(){
        return capacity;
    }

    //Get room quality
    public double getRoomQuality(){
        return roomQuality;
    }

    //Set room quality
    public void setRoomQuality(double r){
        roomQuality = r;
    }

    
}
