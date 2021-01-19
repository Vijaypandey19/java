import java.util.Arrays;
import java.util.Scanner;

public class Quadruple {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter count of values your are going to insert");
        int n=scan.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        if(arr.length<4)
        {
            System.out.println("Invalid Input");
        }
        else{
           
            Arrays.sort(arr);
            int sum1=arr[0]*arr[1]*arr[2]*arr[3];
            int sum2=arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3]*arr[arr.length-4];
            int sum3=arr[0]*arr[1]*arr[arr.length-1]*arr[arr.length-2];
            System.out.println((sum1>sum2)?((sum1>sum3)?sum1:sum3):((sum2>sum3)?sum2:sum3));
        }

        scan.close();
    }
}
