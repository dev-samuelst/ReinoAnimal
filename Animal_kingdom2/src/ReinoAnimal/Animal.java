package ReinoAnimal;

/**
 * 
 * Esta classe representa um animal
 * 
 * @author Samuel Lima dos Santos
 *
 */

public class Animal {
	
	
	
	private String especie;
	private String sexo;
	private double DataNascimento;
	
	private int contador;
	String	dados;
	
	public void comer() {
		
		
		/**
		 * Informa que o animal está comendo
		 * 
		 * @since 27/10/2023
		 */
		
		System.out.println("O anaimal está comendo...");
		
	}
	
	public void perfil() {
		
		/**
		 * Imprime no console os dados do animal
		 * 
		 * @since 27/10/2023
		 */
	dados = "Espécie: " + especie
				+ "Sexo: " + sexo 
				+ "Data de nascimento: " + DataNascimento;
		
		System.out.println(dados);
	}
	
	private void count() {
		
		/**
		 * Incrementa a variavel contador em mais 1. É usado para contar a quantidade de animais ao ser chamado no construtor da classe
		 * 
		 * @since 27/10/2023
		 */
		
		contador++;
	}

	public Animal(String especie, String sexo, double dataNascimento, int contador) {
		super();
		this.especie = especie;
		this.sexo = sexo;
		DataNascimento = dataNascimento;
		this.contador = contador;
		count();
	}
	
	public int quantidade() {
		
		/**
		 * Mostra a quantidade de animais instanciados 
		 * 
		 * @return a quantidade de animais instanciados
		 * 
		 * @since 27/10/2023
		 */
		
		return contador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(double dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	

}
