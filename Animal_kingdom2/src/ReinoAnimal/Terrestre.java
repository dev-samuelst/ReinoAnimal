package ReinoAnimal;

/**
 * Esta classe representa um animal aquático
 * 
 * @author Samuel Lima dos Santos
 *
 */

public class Terrestre extends Animal{
	
	String regiao;
	boolean pelo;
	
	/**
	 * Construtor da classe  Terrestre
	 * 
	 * @param especie
	 * @param sexo
	 * @param dataNascimento
	 * @param regiao
	 * @param pelo
	 */
	
	public Terrestre(String especie, String sexo, double dataNascimento, String regiao, boolean pelo) {
		super(especie, sexo, dataNascimento);
		this.regiao = regiao;
		this.pelo = pelo;
		// TODO Auto-generated constructor stub
	}

	
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
	
			/**
		 	* Informa que o animal está comendo
		 	* 
		 	* @since 27/10/2023
		 	*/
	
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

		public String getRegiao() {
			return regiao;
		}

		public void setRegiao(String regiao) {
			this.regiao = regiao;
		}

		public boolean isPelo() {
			return pelo;
		}

		public void setPelo(boolean pelo) {
			this.pelo = pelo;
		}

		
		
	

}
