package explication;

public class Test {
public static void main(String args[])
{
Voiture v; // la création de l'objet
v=new Voiture(); // instanciation
v.setMarque("toyota"); // encapsulation
v.setCouleur("bleu");
v.setPrix(42000);
System.out.println(v.getMarque()+" "+v.getCouleur()+" "+v.getPrix());
// affichage
Voiture v2=new Voiture("BMW", "noir", 72000);
System.out.println(v2.toString());
if(v.getPrix()>=50000)
{
System.out.println("voiture de lux");	
}
else
{
System.out.println("voiture à la porté!");	
}
if(v.getMarque()=="BMW")
{
System.out.println("belle marque");	
}
Switching switching=new Switching();
switching.setJour(3);
switching.detectJour();


}
}
