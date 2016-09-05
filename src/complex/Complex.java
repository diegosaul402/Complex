package complex;

public class Complex {
	private double real;
	private double img;
	public Complex() {
		
	}
	public Complex(double a, double b) {
		// TODO Auto-generated method stub
		this.real = a;
		this.img = b;

	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImg() {
		return img;
	}

	public void setImg(double img) {
		this.img = img;
	}
	
	public void Suma(Complex a){
		this.real = this.real + a.real;
		this.img = this.img + a.img;
	}
	
	public void Resta(Complex a){
		this.real = this.real - a.real;
		this.img = this.img - a.img;
	}
	
	public void Producto(Complex a){
		double real  = this.real * a.real - this.img * a.img;
		double img = this.real * a.img + this.img * a.real;
		this.real = real;
		this.img = img;
	}

}
