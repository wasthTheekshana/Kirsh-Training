import java.util.Scanner;

public class FirstWay {
    public static void main(String[] args) {
        String message ;
        String checkLetter;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Word :");
        message = sc.nextLine();

        System.out.println("Enter letter want you want check : ");
        checkLetter = sc.nextLine();

        char[] messageArray = message.toCharArray();
        char c = checkLetter.charAt(0);
        int letterCount = 0;
        for (int i=0; i< message.length();i++){
            if (messageArray[i] == c){
                letterCount++;
            }
        }
        System.out.println("The Letter " + checkLetter + " Count is " + letterCount);

    }
}
