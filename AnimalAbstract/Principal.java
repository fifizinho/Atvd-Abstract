package AnimalAbstract;

public class Principal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Nick","Masculino","Cheetos");
		System.out.println("Cachorro:");
		System.out.println("Nome:"+cachorro.getNome());
		System.out.println("Sexo:"+cachorro.getSexo());
		System.out.println("Raca:"+cachorro.getRaca());
		cachorro.emitirSom();
		
		Gato gato = new Gato("Juca","Masculino","Cinzento");
		System.out.println("Gato:");
		System.out.println("Nome:"+gato.getNome());
		System.out.println("Sexo:"+gato.getSexo());
		System.out.println("Raca:"+gato.getRaca());
		gato.emitirSom();
		
		Leao leao = new Leao("Simba","Masculino","Animal");
		System.out.println("Leao:");
		System.out.println("Nome:"+leao.getNome());
		System.out.println("Sexo:"+leao.getSexo());
		System.out.println("Raca:"+leao.getRaca());
		leao.emitirSom();
		
		Lobo lobo = new Lobo("Clara","Feminino","Sla");	
		System.out.println("Lobo:");
		System.out.println("Nome:"+lobo.getNome());
		System.out.println("Sexo:"+lobo.getSexo());
		System.out.println("Raca:"+lobo.getRaca());
		lobo.emitirSom();
		
		Tigre tigre = new Tigre("Matilda","Feminino","Pintada");
		System.out.println("Tigre:");
		System.out.println("Nome:"+tigre.getNome());
		System.out.println("Sexo:"+tigre.getSexo());
		System.out.println("Raca:"+tigre.getRaca());
		tigre.emitirSom();
	}

}
