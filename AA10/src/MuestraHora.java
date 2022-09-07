import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class MuestraHora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola, cuál es tu nombre?");
		String nombre = sc.next();
		
		System.out.println("Buenos días "+nombre+"!");

		try {
			URL url = new URL("https://www.el-tiempo.net/api/json/v2/provincias/28");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();
			int tiempoRespuesta = conn.getResponseCode();
			
			if(tiempoRespuesta != 200) {
				throw new RuntimeException("HttpResponse" +tiempoRespuesta);
			}else {
				StringBuilder informacionString = new StringBuilder();
				Scanner sn = new Scanner(url.openStream());
				while(sn.hasNext()) {
					informacionString.append(sn.nextLine());
				}
				JSONObject json = new JSONObject(informacionString.toString());
				System.out.println(json.getString("title")+":\n"+json.get("today"));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
