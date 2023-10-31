package ExemploAbstrata;

public class Principal {

	public static void main(String[] args) {
		Carro carro = new Carro("00000","f1","Vermelho",2023);
		carro.acelerar();
		
		
		Onibus onib = new Onibus("11111","XB1","Prata",2020);
		onib.acelerar();
		onib.frear();
		onib.ligar();
		onib.virar();
	}

}
