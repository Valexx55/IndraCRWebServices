package DefaultNamespace;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) {
		
		DNI dniService = new DNIProxy();
		
		try {
			System.out.println("letra del dni: "+ dniService.calculaLetraDNI(53130985) );
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

}
