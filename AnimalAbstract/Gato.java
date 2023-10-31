package AnimalAbstract;

public class Gato extends Animal{
	public Gato(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void emitirSom() {
		System.out.println("O gato esta miando");
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
