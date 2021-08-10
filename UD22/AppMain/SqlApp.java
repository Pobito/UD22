package AppMain;

import controllers.Controlador;
import models.Modelo;
import views.Vista;

public class SqlApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		Controlador controlador = new Controlador(modelo, vista);
		controlador.iniciarVista();
	}

}
