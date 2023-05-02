import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) throws Exception {
        
        Trailer t1 = new Trailer(12, 60, 70);
        Trailer t2 = new Trailer(15, 60, 60);
        Trailer t3 = new Trailer(8, 65, 80);

        DoubleTrailer c1 = new DoubleTrailer (t1, t2); //COMMENT: A DoubleTrailer is created from two Trailer objects
        System.out.println(c1.enoughRoom(27) );  //RETURN: true COMMENT: Since its two trailers individually have a total of 27 seats, c1 can seat 30 or fewer people.
        System.out.println(c1.enoughRoom(31)); //RETURN: false COMMENT: c1 cannot seat 31 people.
        System.out.println( c1.getQuality()); //RETURN: 65.0 COMMENT: Because c1’s two single trailers are the same height, its desirability is the average of 70.0 and 60.0.
        
        DoubleTrailer c2 = new DoubleTrailer(t2, t3); //COMMENT: A DoubleTrailer is created from two Trailer objects. 
        System.out.println(c2.enoughRoom(18)); //RETURN: true COMMENT: Since its two trailers individually have a total of 23 seats, c1 can seat 26 or fewer people.
        System.out.println(c2.getQuality()); //RETURN: 50.0 COMMENT: Because c2’s two single trailers are not the same light quality, its desirability is 20 units less than the average of 65.0 and 60.0
        t2.setRoomQuality(70); //COMMENT:Changing the room quality of one of the Trailers that makes up c2 changes the room quality of c2, as illustrated in the next line of the chart. Since setRoomQuality is a Trailer method, you do not need to write it.
        System.out.println(c2.getQuality()); //RETURN: 55.0 COMMENT: Because the view quality of t2 changed, the desirability of c2 has also changed.
        
        
       
       






Since its two trailers individually have a total of 23 seats, c1 can seat 26 or fewer people.
Because c2’s two single trailers are not the same light quality, its desirability is 20 units less than the average of 65.0 and 60.0
Changing the room quality of one of the Trailers that makes up c2 changes the room quality of c2, as illustrated in the next line of the chart. Since setRoomQuality is a Trailer method, you do not need to write it. 
Because the view quality of t2 changed, the desirability of c2 has also changed. 




        


    }
}
