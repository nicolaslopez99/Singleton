
public class Main {

	public static void main(String[] args) {
		Gato persa= Gato.singleton("persa");
		Gato munchkin = Gato.singleton("munchkin");
		
		System.out.println(persa.getRaza());
		System.out.println(munchkin.getRaza());
	}

}
