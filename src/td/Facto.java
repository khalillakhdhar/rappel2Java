package td;

public class Facto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x = 6;
		long fact = 1;
		for (int i = 2; i <= x; i++) {
			fact *= i;
		}
		System.out.println("la factoriel de " + x + " est:" + fact);
	}

}
