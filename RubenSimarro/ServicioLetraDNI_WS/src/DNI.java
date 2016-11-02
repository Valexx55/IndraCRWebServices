
public class DNI {

	public String calculaLetraDNI(int dni){
		
		String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
		
		int modulo= dni % 23;	
		char letra = juegoCaracteres.charAt(modulo);
		
		return String.valueOf(letra); 
			 
	}
}

