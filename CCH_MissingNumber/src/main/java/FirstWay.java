
import java.util.Scanner;

public class FirstWay {
    public static void main(String[] args) {
        int swapNumber =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Numbers :");

        String[] num = sc.next().split(",");
        System.out.println(num.length);
        int[] count = new int[num.length];
        for(int i=0; i< count.length ;i++)     //Initialize array
        {
            count[i]= Integer.parseInt(num[i]);
        }
        //if array is unsorted we want sorted that array

        for(int i = 0; i<count.length-1;i++){
            for(int j = 0; j < count.length-1;j++){
                if (count[j] > count[j+1]){
                    swapNumber = count[j];
                    count[j] = count[j+1];
                    count[j+1] = swapNumber;
                }
            }
        }

checkMissingNumber(count);

    }

    public static void checkMissingNumber(int[] arra){
        int size = arra.length;
        int left = 0;
        int right = size -1;
        int middle = 0;

        while ((right - left) > 1){
            middle  = (right + left)/2;
            if ((arra[left] - left) != (arra[middle] -middle)){
                right = middle;
            }
            if ((arra[right] - right) != (arra[middle] -middle)){
                left = middle;
            }
        }

        System.out.println(arra[left]+1);
    }
}
