import java.util.Scanner;
import java.util.Arrays;

public class KthSeq {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers you want to enter and the value of k");
        int n = scan.nextInt();
        int k=scan.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int result=findMaxProduct(arr, k,n);
        System.out.println(result);
        scan.close();
    }

    static int findMaxProduct(int [] nums,int k,int n){
        Arrays.sort(nums);

        if(n<k)
        {
            return -1;
        }
        if(k%2==0)
        {
            int sum1=1;
            int sum3=1;
            for(int i=n-1;i>(n-k-1);i--){
                sum1=sum1*nums[i];
                if(i>n-(k/2)-1)
                    sum3=sum3*nums[i];
            }

            int sum2=1;
            for(int i=0;i<k;i++)
            {
                sum2=nums[i]*sum2;
                if(i<k/2)
                    sum3=sum3*nums[i];
            }

           return (sum1>sum2)?(sum1>sum3?sum1:sum3):(sum2>sum3?sum2:sum3);
          
        }
        else{
            return 0;
        }

       
    }
}
