package n1exercici2.beans;

public class CalculoDni {
	
	
	public char calcularLletraDni(int numeroDni) {
		
		char[] lletrasDni = {'T','R','W','A','G','M','Y','F','P','D','X','B','N'
				,'J','Z','S','Q','V','H','L','C','K','E'};
		char lletraDni = ' ';
		lletraDni =lletrasDni[numeroDni % 23];
	
		return lletraDni;
	}
		
}
