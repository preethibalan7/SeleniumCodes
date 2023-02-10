package week1.day2;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13789;
		int counter=0;
		if(a<=1) {
			System.out.println("This is not a prime number" +a);
		}
		for(int i=1;i<=a/2;i++) {
			if(a%i==0) {
				counter++;
			}
		}
		if(counter>1) {
			System.out.println("This is not a prime number" +a);
		}
		else {
			System.out.println("This is a prime number"  +a);
		}

	}

}
