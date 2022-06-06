package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import clases.Usuario;

public class ManejoFicheros {

	private static final String ficheroCache = "cache.txt";

	/**
	 * Metodo encargado de leer un fichero que de existir contiene el usuario y
	 * contraseña de la anterior persona que se reegistro o inicio sesion
	 * 
	 * @return un objeto de tipo persona con la persona gurdada den el fichero
	 */

	public static Usuario leerLogin() {

		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(ficheroCache)));
			String linea = br.readLine();
			if (linea != null) {
				String[] datosUsuario = linea.split(";");
				Usuario usu = new Usuario();
				usu.setEmail(datosUsuario[0]);
				usu.setContraseña(datosUsuario[1]);
				return usu;
			}

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
		return null;

	}

	/**
	 * Metodo encargado de guardar en un fichero el usuario y contraseña de un
	 * usuario
	 * 
	 * @param usuario
	 * @param contraseña
	 * @return si lo ha insertado correctamente
	 */

	public static boolean insertarLogin(String usuario, String contraseña) {

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(ficheroCache)));
			bw.write(usuario + ";" + contraseña);
			bw.flush();
			bw.close();
			return true;
		} catch (IOException e) {
			return false;
		}

	}

	/**
	 * Metodo encargado de cerrar sesion
	 */

	public static void cerrarSesion() {
		File fichero = new File(ficheroCache);
		fichero.delete();
	}
}
