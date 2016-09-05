package main;
import complex.Complex;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex complejo = new Complex(3,1);
		System.out.println("R: " + complejo.getReal() + ", I: " + complejo.getImg());
		
		Complex complejo2 = new Complex(2,2);
		complejo.Suma(complejo2);
		System.out.println("R: " + complejo.getReal() + ", I: " + complejo.getImg());

	}

}
