package dateexec;

import java.util.Date;

/**
 * Created by Aditya on 27/06/2016.
 */
public class TestarData {
    public static void main (String args[]){
        Date dt = new Date();
        System.out.println ( dt + " : " + dt.getTime());

        Date dt1 = new Date();
        dt1.setTime(1500800007021L);
        System.out.println( dt1 + " : " + dt1.getTime());
    }
}
