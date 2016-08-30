
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
