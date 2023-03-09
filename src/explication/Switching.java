package explication;

public class Switching {
private int jour;

public int getJour() {
	return jour;
}

public void setJour(int jour) {
	this.jour = jour;
}

@Override
public String toString() {
	return "Switching [jour=" + jour + "]";
}
public void detectJour()
{
switch (this.jour) {
case 1: {
	
	System.out.println("lundi");
	break;
}
case 2: {
	System.out.println("mardi");
	break;
}
case 3: 
{
System.out.println("mercredi");	
break;
}
case 4:
{
System.out.println("jeudi");
break;
}
case 5:
{
System.out.println("vendredi");	
break;
}
case 6:
{
System.out.println("samedi");
break;
}
case 7:
{
System.out.println("dimanche");
break;
}
}	
}

}
