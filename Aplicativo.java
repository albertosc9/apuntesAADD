package es.iestetuan.dam2.app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import es.iestetuan.dam2.configProperties.GestorConfiguracion;
import es.iestetuan.dam2.dao.IAlumno;
import es.iestetuan.dam2.dao.jdbc.AlumnoJDBC;
import es.iestetuan.dam2.dao.txt.AlumnoTxt;
import es.iestetuan.dam2.dao.xml.AlumnoXml;
import es.iestetuan.dam2.vo.Alumno;


public class Aplicativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(GestorConfiguracion.gestionPropiedades("url"));
		System.out.println(GestorConfiguracion.gestionJson("url"));
		System.out.println(GestorConfiguracion.gestionXML("conectores","driver"));
				
				
				
				
			
				
			
			
			
			
	
		
		

				
				
				
//		Aplicativo app = new Aplicativo();
//		
//		app.tratamientoDAOJdbc();
//		
		
//		AlumnoXml a1 = new AlumnoXml();
//	AlumnoJDBC a2 = new AlumnoJDBC();
//		AlumnoTxt a3 = new AlumnoTxt();
//		
//		
//		
//		List<Alumno>lista1 = a3.getAlumnos();
//		
		

		//primera carga en la base de datos desde el fichero TXT.
//		a2.guardarUsuario(lista);
		
		
		
		
	/*	
	 OPERACIONES EN EL XML.
	List<Alumno>lista = a1.getAlumnos();
	
	for (Alumno al : lista) {
		System.out.println(al);
	}
		
		//creacion del xml. 
		a1.guardarUsuario(lista);
		
		
		a1.altaAlumno(new Alumno(999,"alberto","sanchez","","","",0));
		a1.borrarAlumno(999);
		
		
		
		*/
		
		
//		List<Alumno>lista  = a2.getAlumnos();
//	
//		for (Alumno al : lista) {
//		System.out.println(al);
//		}
//		
		
	}
	
	private void tratamientoDAOJdbc() {
		IAlumno operaciones = new AlumnoJDBC();
		
		operaciones.borrarAlumno(21);
		/*
	 	OPERACIONES EN LA BASE DE DATOS. 
	 	
	 
	
		a2.guardarUsuario(lista);
			
		a2.altaAlumno(new Alumno(999,"alberto","sanchez","","","",0));
			
		a2.modificarAlumno(new Alumno(999,"alberto","sanchez",null,null,null,0));
			
		a2.borrarAlumno(999);
	*/
	}

}
