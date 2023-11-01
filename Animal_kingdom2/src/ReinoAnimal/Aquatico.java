package ReinoAnimal;

/**
 * Esta classe representa um animal aquático
 * 
 * @author Samuel Lima dos Santos
 *
 */

public class Aquatico extends Animal {
	
	
	private String tipoAgua;
	private boolean escamoso;
	
	
	/**
	 * Construtor da classe Aquatico
	 * 
	 * @param especie
	 * @param sexo
	 * @param dataNascimento
	 * @param tipoAgua
	 * @param escamoso
	 */

	public Aquatico(String especie, String sexo, double dataNascimento, String tipoAgua, boolean escamoso) {
		super(especie, sexo, dataNascimento);
		this.tipoAgua = tipoAgua;
		this.escamoso = escamoso;
		
		// TODO Auto-generated constructor stub
	}

	public void nadar() {
		
		/**
		 * Imprime no console que o animal está nadando
		 * 
		 *  @since 27/10/2023
		 */
		System.out.println("O animal está nadando...");
		
		
	}
	
	public void comer() {
	
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

	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public boolean isEscamoso() {
		return escamoso;
	}

	public void setEscamoso(boolean escamoso) {
		this.escamoso = escamoso;
	}

	
}
