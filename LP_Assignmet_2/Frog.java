import java.util.Scanner;

public class Frog{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double distance = 0;
int timeSlot = 0;
int count = 0;


while(distance <=0){
	try{
		System.out.print("Enter the distance : ");
		distance = sc.nextDouble();
		if(distance ==0){
		System.out.println("Please Enter the Valed Distance");
		}
	}catch(Exception e){
		sc.nextLine();
		System.out.print("Enter the Number");
	}
}

	while(distance > 0){
		if(count >0){
		timeSlot+=1;
		}

		distance -=5;
		count++;

		if(distance >0){
		distance-=3;
		timeSlot+=2;
		count++;
			if(distance>0){
			distance-=1;
			timeSlot+=3;
			count++;
			}
		}
	}

System.out.println("Frog Jump count " + count); 
System.out.println("Time Slot : " + timeSlot/60 + "min : " + timeSlot%60 +"Sec "); 

}

}