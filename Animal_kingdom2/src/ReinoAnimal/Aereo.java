package ReinoAnimal;

public class Aereo extends Animal{

	public Aereo(String especie, String sexo, double dataNascimento, int contador) {
		super(especie, sexo, dataNascimento, contador);
		// TODO Auto-generated constructor stub
	}
	
	double altitude;
	
	
public void voar() {
		
		/**
		 * Imprime no console que o animal está voando
		 * 
		 *  @since 27/10/2023
		 */
		System.out.println("O animal está se voando...");
		
		
		}

@Override

		public void comer() {
			
	 		/**
	 		* Informa que o animal está comendo
	 		* 
	 		* @since 27/10/2023
	 		*/
	
	
			System.out.println("O animal aéreo está comendo...");
		}
		
		public void perfil() { 
			
			/**
			 * Imprime no console os dados do animal
			 * 
			 * @since 27/10/2023
			 * 
			 **/
			
			super.perfil();
			System.out.println("Altitude de vôo: " + altitude);
			
		}

}
