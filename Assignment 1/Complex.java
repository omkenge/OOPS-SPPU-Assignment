public class Complex {
	float real, img;

	Complex() {
	}

	public Complex(float x, float y) {
		real = x;
		img = y;
	}

	Complex add(Complex a) {
		Complex temp = new Complex();
		temp.real = this.real + a.real;
		temp.img = this.img + a.img;
		return temp;
	}

	Complex sub(Complex a) {
		Complex temp = new Complex();
		temp.real = this.real - a.real;
		temp.img = this.img - a.img;
		return temp;
	}

	public static void main(String[] args) {
		Complex c1 = new Complex(6.1f, 7.3f);
		Complex c2 = new Complex(2.6f, 4.1f);
		Complex result;
		result = c1.add(c2);
		System.out.printf("Addition : %2.2f+%2.2f", result.real, result.img);
		result = c1.sub(c2);
		System.out.printf("Subtraction : %2.2f-%2.2f", result.real, result.img);

	}
}
