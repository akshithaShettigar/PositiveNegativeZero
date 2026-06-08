//Check whether given number is Positive, Negative or Zero
import java.util.Scanner;
class PosNegZer{
	int n;
	PosNegZer(int n){
		this.n=n;
	}
	void calculation(){ 
		if(n==0){
			System.out.print("The number is Zero");

		}else if(n>0) {
			System.out.print("The number is Positive");

		}
		else{
			System.out.print("The number is Negative");

		}	
	}
	
}
class PositiveNegativeZeroMain{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		PosNegZer p1= new PosNegZer(n);
		p1.calculation();

	}
}
