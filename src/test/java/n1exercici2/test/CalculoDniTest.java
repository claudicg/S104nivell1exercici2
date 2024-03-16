package n1exercici2.test;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import n1exercici2.beans.CalculoDni;

public class CalculoDniTest {
	
	
	@ParameterizedTest
	@CsvSource(value ={"00904589:E","99465108:K", "64936738:X", "63876137:P","82795588:G", "64907716:Z"
			, "09613184:N", "05306459:Z", "76217195:W", "93457746:Y"}, delimiter = ':')
	void testCalcularDni2(String numeroDni, char lletraEsperada) {
		
		CalculoDni dni = new CalculoDni();
        
		assertEquals(lletraEsperada, dni.calcularLletraDni(Integer.parseInt(numeroDni)));
		
	}
}
