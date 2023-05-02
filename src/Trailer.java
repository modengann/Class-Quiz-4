public class Trailer {
    private double lightQuality;
    private double roomQuality;
    private int capacity;

    public Trailer(int c, double l, double r){
        capacity = c;
        lightQuality = l;
        roomQuality = r;
    }

    public void setLightQuality(double l){
        lightQuality = l;
    }

    public int getCapacity(){
        return capacity;
    }

    public double getLightQuality(){
        return lightQuality;
    }

    public double getRoomQuality(){
        return roomQuality;
    }

    public void setRoomQuality(double r){
        roomQuality = r;
    }

    
}
