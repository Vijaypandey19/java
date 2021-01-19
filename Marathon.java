import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        ArrayList<Float> racers=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        while(!s.equals("q")){
            racers.add(Float.parseFloat(s.trim()));
            s=scan.next();
        }
        Collections.sort(racers,Collections.reverseOrder());
        int count=0;
        for(Float a:racers)
        {
         
            if(a != Float.parseFloat("42.195") && count <3){
                count++;
                System.out.println(a);
            }
            
          
        }
        scan.close();
    }
}
