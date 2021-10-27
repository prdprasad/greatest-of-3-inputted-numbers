import java.util.*;
class GreatestNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("--Enter Three Numbers to find the greatest number--");
		System.out.print("Enter First Number:");
		int num1=sc.nextInt();
		System.out.print("Enter Second Number:");
		int num2=sc.nextInt();
		System.out.print("Enter Third Number:");
		int num3=sc.nextInt();
		
		if((num1>num2) && (num1>num3)){
			System.out.print("greatest Number is: "+num1);
		}
		else if(num2>num3){
			System.out.print("greatest Number is: "+num2);
		}
		else{
			System.out.print("greatest Number is: "+num3);
		}
	}
}
		
		