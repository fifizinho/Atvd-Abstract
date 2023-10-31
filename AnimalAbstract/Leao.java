package AnimalAbstract;

public class Leao extends Animal {

	public Leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void emitirSom() {
		System.out.println("O leao está uivando");
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
