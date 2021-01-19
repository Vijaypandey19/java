import java.util.Scanner;

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

        scan.close();
    }
}
