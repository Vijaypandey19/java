import java.util.Arrays;
import java.util.Scanner;

public class Triplet {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers you want to enter");
        int n = scan.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int result=Triplet.findMaxProduct(arr);
        System.out.println(result);
        scan.close();
    }

    static int findMaxProduct(int [] nums){
        if(nums.length<3)
        {
            return -1;
        }
        else{
            Arrays.sort(nums);
            int sum1=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
            int sum2=nums[0]*nums[1]*nums[nums.length-1];
            if(sum1>sum2)
                return sum1;
            else
                return sum2; 
        }
       
    }
}
