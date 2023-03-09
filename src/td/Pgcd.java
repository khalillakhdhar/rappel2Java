package td;

public class Pgcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=24;
int y=24;
while(x!=y)
{
if(x>y)	
{
x=x-y;	
}
else
	y=y-x;
}
System.out.println("le plus grand commun diviseur est: "+x);
		
		
	}

}
