package AnimalAbstract;

public class Cachorro extends Animal{
	public Cachorro(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void emitirSom() {
		System.out.println("O cachorro esta latindo");
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