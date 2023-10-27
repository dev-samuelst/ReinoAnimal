package ReinoAnimal;

/**
 * Esta classe representa um animal aquático
 * 
 * @author Samuel Lima dos Santos
 *
 */

public class Terrestre extends Animal{

	public Terrestre(String especie, String sexo, double dataNascimento, int contador) {
		super(especie, sexo, dataNascimento, contador);
		// TODO Auto-generated constructor stub
	}
	
	String regiao;
	boolean pelo;
	
public void mover() {
		
		/**
		 * Imprime no console que o animal está se movendo
		 * 
		 *  @since 27/10/2023
		 */
		System.out.println("O animal está se movendo...");
		
		
		}

@Override

		public void comer() {
			// TODO Auto-generated method stub
			System.out.println("O animal terrestre está comendo...");
		}
		
		public void perfil() { 
			
			/**
			 * Imprime no console os dados do animal
			 * 
			 * @since 27/10/2023
			 * 
			 **/
			
			super.perfil();
			System.out.println("Pertencente a região: " + regiao
					+ "Possui pelo: " + pelo);
			
		}

		
		
	

}
