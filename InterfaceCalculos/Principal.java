package InterfaceCalculos;

public class Principal {

	public static void main(String[] args) {
		Calculando cal = new Calculando();
		System.out.println("SOMA:");
		System.out.println(cal.somar(10,10));
		System.out.println("SUBTRAÇÂO:");
		System.out.println(cal.sub(10, 10));
		System.out.println("DIVISÂO:");
		System.out.println(cal.div(10, 2));
		System.out.println("MULTIPLICAÇÂO:");
		System.out.println(cal.multi(10, 10));
		System.out.println("EXPO:");
		System.out.println(cal.exp(10, 10));
	}

}
