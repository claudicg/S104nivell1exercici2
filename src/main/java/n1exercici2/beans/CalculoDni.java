package n1exercici2.beans;

import java.util.ArrayList;
import java.util.List;

public class CalculoDni {
	
	private String dniSinLletra;
	
	
	public CalculoDni() {
		super();
	}
	
	public CalculoDni(String dniSinLletra) {
		super();
		this.dniSinLletra = dniSinLletra;
		
	}
	

	public String getDniSinLletra() {
		return dniSinLletra;
	}

	public void setDniSinLletra(String dniSinLletra) {
		this.dniSinLletra = dniSinLletra;
	}



	public String calcularLletraDni(String dniSinLletra) {
		
		final int DIVISION_DNI = 23;
		int numeroDni = Integer.parseInt(dniSinLletra) ;
		String[] lletrasDni = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		
		String lletraDni = "";
		int restoDni = 0;
		
		restoDni = numeroDni % DIVISION_DNI;
		lletraDni =lletrasDni[restoDni];
	
		return lletraDni;
	}
	
	public List<String> generarLListaDni() {
		
		List<String> llistaDnis = new ArrayList<>();
		
		llistaDnis.add("00904589E");
		llistaDnis.add("99465108K");
		llistaDnis.add("64936738X");
		llistaDnis.add("63876137P");
		llistaDnis.add("82795588G");
		llistaDnis.add("64907716Z");
		llistaDnis.add("09613184N");
		llistaDnis.add("05306459Z");
		llistaDnis.add("76217195W");
		llistaDnis.add("93457746Y");
		
		return llistaDnis;
	}
		

}
