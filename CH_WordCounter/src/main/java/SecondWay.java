import java.util.Scanner;

public class SecondWay {
    public static void main(String[] args) {
        String message;
        int countArray[] = new int[256];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Word : ");
        message = sc.nextLine();

        for (int i =0; i<message.length();i++){
            countArray[message.charAt(i)]++;
        }

        for (int j = 0; j<countArray.length;j++){
            if (countArray[j] != 0){
            System.out.println((char) j + "-------" + countArray[j]);
            }
        }
    }
}
