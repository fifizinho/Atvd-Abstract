package AnimalAbstract;

public class Lobo extends Animal {

	public Lobo(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void emitirSom(){
		System.out.println("O lobo está roncando");
	}
	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caminhar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
	}
}
