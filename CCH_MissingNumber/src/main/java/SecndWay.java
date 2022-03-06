public class SecndWay {


    public static void main(String args[]) {

        int[] input = {9,6,7,4,3,5,2,8,1};

        int n = input.length + 1;
        int sumOfNNumbers = (n*(n+1))/2;;

        int sumOfInputArray = sumOfInputArrayNumbers(input);
        int missingNumber = sumOfNNumbers - sumOfInputArray;
        System.out.println("Missing number in an array is : "
                + missingNumber);
    }

    public static int sumOfInputArrayNumbers(int[] input){
        int sum = 0;
        for(int i=0; i < input.length ;i++){
            sum = sum + input[i];
        }
        return sum;

//        int a[] = {1,2,4,5,6,7};
//        for (int i = 0; i < a.length-1; i++) {
//            int b = a[i];
//            if(!((a[i]+1) == a[i+1])){
//                System.out.println(a[i]+1);
//            }
//
//        }
//        int fr = a[0];
//          for (int i = 0; i < a.length; i++) {
//            int b = fr+i;
//            if(a[i] != b){
//                System.out.println(b);
//            }
//
//        }
    }
}
