package n1exercici2.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import n1exercici2.beans.CalculoDni;

public class CalculoDniTest {
	
	CalculoDni dni = new CalculoDni();
	
	@Test
	void testCalcularDni() {
		
		String lletraDni = "Q";
		String resultat = dni.calcularLletraDni("20045781");
		assertEquals(lletraDni, resultat);
	}
	
	
	@Test
	void testCalcularDni1() {
		 
		 CalculoDni llistaDni = new CalculoDni();
		 List<String> llistaDnis = llistaDni.generarLListaDni();
		 
		
		 String resultat;
		 
		 for(int i = 0; i < llistaDnis.size(); i++) {
			 
			 String lletraDni = llistaDnis.get(i).substring(8);
			 String numeroDni = llistaDnis.get(i).substring(0, 8);
			 resultat = dni.calcularLletraDni(numeroDni);		 
			 assertEquals(lletraDni, resultat);
		 }
		 
		 
	 }	 
}
