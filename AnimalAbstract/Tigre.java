package AnimalAbstract;

public class Tigre extends Animal{
	public Tigre(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void emitirSom() {
		System.out.println("O tigre esta rugindo");
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
