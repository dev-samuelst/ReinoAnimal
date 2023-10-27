package ReinoAnimal;

/**
 * Esta classe representa um animal aquático
 * 
 * @author Samuel Lima dos Santos
 *
 */

public class Aquatico extends Animal {

	public Aquatico(String especie, String sexo, double dataNascimento, int contador) {
		super(especie, sexo, dataNascimento, contador);
		// TODO Auto-generated constructor stub
	}
	
	String tipoAgua;
	boolean escamoso;
	
	
	public void nadar() {
		
		/**
		 * Imprime no console que o animal está nadando
		 * 
		 *  @since 27/10/2023
		 */
		System.out.println("O animal está nadando...");
		
		
	}
	
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("O animal aquatico está comendo...");
	}
	
	@Override
	public void perfil() { 
		
		/**
		 * Imprime no console os dados do animal
		 * 
		 * @since 27/10/2023
		 * 
		 **/
		
		super.perfil();
		System.out.println("Tipo de água: " + tipoAgua
				+ "Escamoso: " + escamoso);
		
	}

}
