import java.util.Arrays;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        char[] s1=s.toCharArray();
        int[] count=new int[127];
        for(char c:s1)
        {
            count[c]++;
        }
        char maxChar;
        int max;
        max=count[0];
        maxChar=(char)count[0];
        for(int i=0;i<127;i++)
        {
            if(count[i]>max)
            {
                max=count[i];
                maxChar=(char)i;
            }
        }
        System.out.println("Character :"+maxChar+" Number of time:"+max);


        scan.close();
    }
}
