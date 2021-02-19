package edu.escuelaing.arep.app.client;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Cliente {
	
	
	/**
	 * Cliente encargado de realizar una petici�n POST al servidor de heroku y muestra la infomaci�n enviada por el servidor
	 * @param args Son los parametros al momento de ejecutar
	 */
	public static void main(String[] args) {
		try {
			URL url = new URL("https://intense-badlands-44966.herokuapp.com/operation?operation=cos&number=15");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setDoOutput(true);
			connection.setUseCaches(false);

			InputStream inConnection = connection.getInputStream();

			BufferedReader rd = new BufferedReader(new InputStreamReader(inConnection));
			StringBuilder res = new StringBuilder();
			String linea ;

			while ((linea = rd.readLine()) != null) {
				res.append(linea);
			}
			rd.close();
			System.out.println("El JSON OBTENIDO ES: \n" + res.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Ocurrio un error al intentar realizar la peticion del servidor");
		}
	}
}
