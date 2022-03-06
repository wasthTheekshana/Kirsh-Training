import java.util.Scanner;

public class FirstWay {
    public static void main(String[] args) {
        String message ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Word :");
        message = sc.nextLine();


        int[] freq = new int[message.length()];
        char[] messageArray = message.toCharArray();

        for (int i=0; i< message.length();i++){
            freq[i] = 1;
            for (int j = i+1; j<message.length();j++){
                if (messageArray[i] == messageArray[j]){
                    freq[i]++;
                    messageArray[j] = '0';
                }
            }

        }

        for (int i =0;i< freq.length;i++){
            if(messageArray[i] != ' ' && messageArray[i] !='0'){
                System.out.println(messageArray[i] + "-------" + freq[i]);
            }
        }
//        System.out.println("The Letter " + checkLetter + " Count is " + letterCount);

    }
}
