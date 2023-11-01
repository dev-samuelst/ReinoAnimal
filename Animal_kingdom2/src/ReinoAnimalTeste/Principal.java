package ReinoAnimalTeste;

import ReinoAnimal.Aereo;
import ReinoAnimal.Animal;
import ReinoAnimal.Aquatico;
import ReinoAnimal.Terrestre;

/**
 * Classe onde ocorrem os testes
 * 
 * @author Samuel Lima dos Santos
 *
 */
public class Principal {
	
	/**
	 * O método main é utilizado para realizar testes
	 * @param args
	 */

	public static void main(String[] args) {
		
		Aquatico aqua = new Aquatico("Carcharias taurus", "fêmea", 7, "água salgada", false);
		Aquatico aqua2 = new Aquatico("Pygocentrus nattereri", "macho", 3, "água doce", true);
		
		Terrestre earth = new Terrestre("Felis catus", "fêmea", 2, "Ásia", true);
		Terrestre earth2 = new Terrestre("Hydrochoerus hydrochaeris", "macho", 8, "América do Sul", true);
		
		Aereo air = new Aereo("Coragyps atratus", "macho", 3, 54.5);
		Aereo air2 = new Aereo("Amazona aestiva", "fêmea", 10, 37.9);
		
		aqua.comer();
		
		aqua2.nadar();
		
		
		earth.comer();
		
		earth2.mover();
		
		air.comer();
		
		air2.voar();
		
		
		System.out.println(Animal.quantidade());

	}

}
