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
			URL url = new URL("https://intense-badlands-44966.herokuapp.com/operation?operation=sin&number=15");
			HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
			conexion.setRequestMethod("GET");
			conexion.setRequestProperty("Content-Type", "application/json");
			conexion.setDoOutput(true);
			conexion.setUseCaches(false);

			InputStream inconnection = conexion.getInputStream();

			BufferedReader rd = new BufferedReader(new InputStreamReader(inconnection));
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
			System.err.println("Ocurrio un error al intentar realizar la petici�n GET al servidor");
		}
	}
}
