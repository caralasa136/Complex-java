#Complex with Java

>**Main.java**

```java
public class Main {

	public static void main(String[] args)
	{
		Complex complejo1 = new Complex(3,2);
		Complex complejo2 = new Complex(1,-2);
		Complex complejo3 = new Complex (0,0);
		complejo3.sum(complejo1, complejo2);
		System.out.println("Suma = "+"Real: "+complejo3.getReal()+" Img: "+complejo3.getImg()+"i");
		complejo3.sub(complejo1, complejo2);
		System.out.println("Resta = "+"Real: "+complejo3.getReal()+" Img: "+complejo3.getImg()+"i");
		complejo3.mult(complejo1, complejo2);
		System.out.println("Multiplicación = Real: "+ complejo3.getReal() + " Img: " + complejo3.getImg()+"i");
		complejo3.div(complejo1, complejo2);
		System.out.println("División = "+"Real: "+complejo3.getReal()+" Img: "+complejo3.getImg()+"i");
	}


}
```

>**Complex.java**


```java
public class Complex {
		
		private double real;
		private double img;
		
		public Complex (double r, double i)
		{
			this.real = r;
			this.img = i;
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
		
		public void sum(Complex a, Complex b)
		{
			this.real = a.getReal() + b.getReal();
			this.img = a.getImg() + b.getImg();
		}
		public void sub(Complex a, Complex b)
		{
			this.real = a.getReal() - b.getReal();
			this.img = a.getImg() - b.getImg();
		}
		
		public void mult(Complex a, Complex b){
			this.real = (a.getReal()*b.getReal())-(a.getImg()*b.getImg());
			this.img = (a.getReal()*b.getImg())+(a.getImg()*b.getReal());
		}
		
		public void div(Complex a, Complex b){
			this.real = ((a.getReal()*b.getReal())+(a.getImg()*b.getImg()))/(Math.pow(b.getReal(), 2)+Math.pow(b.getImg(), 2));
			this.img =  ((a.getImg()*b.getReal())-(a.getReal()*b.getImg()))/(Math.pow(b.getReal(), 2)+Math.pow(b.getImg(), 2));;
		}
		

	}
```

