public class TimeMeasurement{
public static void main(String[] args){
    long startTime = System.currentTimeMillis();  // record the starting time
    /* (run the algorithm) */
    long endTime = System.currentTimeMillis();  //record the ending time
    long elapsed = endTime - startTime;         // compute the elapsed time
    System.out.println(elapsed);
}
}