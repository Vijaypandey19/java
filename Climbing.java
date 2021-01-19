import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class Climbing {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [] scores=new int[n];
        for(int i=0;i<n;i++)
        {
            scores[i]=scan.nextInt();
        }
        int m=scan.nextInt();
        int [] alice=new int[m];
        for(int i=0;i<m;i++)
        {
            alice[i]=scan.nextInt();
        }
        int []res=new int[m];
        climbing(scores,alice);


        scan.close();
    }

    public static void climbing(int[] scores,int[] chacha){
        List<Integer> scoresList=Arrays.asList(scores);
        Set<Integer> set = new HashSet<>(scoresList);
        System.out.println(set);
    }
}
