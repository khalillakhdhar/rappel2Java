package rappel2Java;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double y=30.45;
		// double > float > int
		// => double =float ou int/  float=int 
		int x=32;
		x+=3; // x=x+3;
		x++; // x+1
		x--;// x=x-1
		y-=1.45; // y=y-1.45
		int z=(int) y; 
		// casting de y dans z (prendre l'entier)
		String valeur="341";
		int w=Integer.parseInt(valeur); // convertir valeur "341" en entier
		Double.parseDouble(valeur); // en double
		Float.parseFloat(valeur); // en float
		boolean b=true; // valeur directe => true ou false
		b=x>y; // expression logique => évaluer en true ou false

	}

}
