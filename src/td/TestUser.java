package td;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developpeur d = new Developpeur("ahmed", "Hamed", 1300, 1);
		Developpeur d2 = new Developpeur("Mohamed", "Hamdi", 3300, 3);
		Developpeur d3 = new Developpeur("Gmari", "Said", 6300, 9);
		System.out.println(d.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
	}

}
