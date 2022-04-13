package hesapMakinesi;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a,b,select;
		Scanner scan=new Scanner(System.in);
		System.out.print("Input the first number please: ");
		a=scan.nextInt();
		System.out.print("Input the second number please:");
		b=scan.nextInt();
		System.out.print("Select transaction please:\n1.Addiotion\n2.Subtraction\n3.Multiplication\n4.Division");
		select=scan.nextInt();
		
		switch(select) {
		case 1:
			System.out.print("Result: "+ (a+b));
			break;
		case 2:
			System.out.print("Result: "+ (a-b));
			break;
		case 3:
			System.out.print("Result: "+ (a*b));
			break;
		case 4:
			if(b!=0) {
				System.out.print("Result: "+(a/b));
			}else
			{System.out.print("Upps! Error: Divisor cannot be 0");}
			break;
			default:{
				System.out.print("you entered an invalid number");
			}
			
			
		}
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
			
			
			
		
			
			
			
			
			
			
			
			
			
		

	}

}
