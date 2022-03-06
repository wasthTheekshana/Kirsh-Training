
import java.util.Scanner;

public class FirstWay {
    public static void main(String[] args) {
        int swapNumber =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Numbers :");

        String[] num = sc.next().split(",");
        System.out.println("Array length : " + num.length);
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

       int missingNumber = checkMissingNumber(count);
        if (missingNumber > 0){

        System.out.println("The Misseing Number is : " + missingNumber);
        }else {
            int missingFisr = count[0]-1;
            System.out.println("There ara no missing number in the middle so it can be first or last");
            System.out.println("so first number is : " + (count[0]-1) + " or " + "last number : " + (count[count.length-1]+1));
        }
    }

    public static int checkMissingNumber(int[] arra){
        int size = arra.length;
        int left = 0;
        int right = size -1;
        int middle = 0;
        int count = 0;

        while ((right - left) > 1){
            middle  = (right + left)/2;
            if ((arra[left] - left) != (arra[middle] -middle)){
                right = middle;
                count++;
            }
            if ((arra[right] - right) != (arra[middle] -middle)){
                left = middle;
                count++;
            }
            if (count <=0){
                return -1;

            }
        }

       return (arra[left]+1);
    }
}
