import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;


public class ClienteRs {

	
	public static void main(String[] args) {
		 
		
		Client cliente = Client.create();
		WebResource webResource = cliente.resource("http://localhost:8080/JerseyCR/rest/equipo/info/RM");
		String s = webResource.get(String.class);
		System.out.println(s);

		Client cliente1 = Client.create();
		WebResource webResource1 = cliente1.resource("http://localhost:8080/JerseyCR/rest/equipo");
		String s1 = webResource1.get(String.class);
		System.out.println(s1);
		
		
	}

}
