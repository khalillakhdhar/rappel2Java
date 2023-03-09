package rappel2Java;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double y=30.45;
		// double > float > int
		// => double =float ou int/  float=int 
		int x=32;
		int z=(int) y; 
		// casting de y dans z (prendre l'entier)
		String valeur="341";
		Integer.parseInt(valeur); // convertir valeur "341" en entier
		Double.parseDouble(valeur); // en double
		Float.parseFloat(valeur); // en float
		

	}

}
