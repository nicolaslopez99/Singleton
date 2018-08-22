public class Gato {
	private String raza;
	private static Gato gato;
	private Gato(String raza) {
		this.setRaza(raza);
		System.out.println(this.raza);
	}
	public static Gato singleton(String raza) {
		if(gato== null) {
			gato = new Gato(raza);
		}
		else {
			System.out.println("ya hay un objeto creado");
		}
		return gato;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
}
