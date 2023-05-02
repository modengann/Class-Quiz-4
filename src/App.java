import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) throws Exception {
        
        Trailer t1 = new Trailer(12, 60, 70);
        Trailer t2 = new Trailer(15, 60, 60);
        Trailer t3 = new Trailer(8, 65, 80);

        DoubleTrailer c1 = new DoubleTrailer (t1, t2);
        System.out.println(c1.enoughRoom(27) );
        System.out.println(c1.enoughRoom(31));
        System.out.println( c1.getQuality());
        
        DoubleTrailer c2 = new DoubleTrailer(t2, t3);
        System.out.println(c2.enoughRoom(18));
        System.out.println(c2.getQuality());
        t2.setRoomQuality(70);
        System.out.println(c2.getQuality());
        
       
        
        


    }
}
