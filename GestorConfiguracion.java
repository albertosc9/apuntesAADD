package es.iestetuan.dam2.configProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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

import com.google.gson.JsonObject;

public class GestorConfiguracion {

	
	static Properties prop;
	static 	JSONObject object;
	static Document xml;
	
	
	private static Document cargarDocumento() {
		
		if(xml==null) {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db;
			
				try {
					db = dbf.newDocumentBuilder();
					xml = db.parse("recursos/config.xml");
					
					
				} catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
		return xml;
		
			
		
	}
	public static String gestionXML(String nodo,String clave) {
	
		xml = cargarDocumento();
		String valor = null;
		NodeList nodos = xml.getElementsByTagName(nodo);
		
		
		for (int i=0;i<nodos.getLength();i++) {
			Node nodo1 = nodos.item(i);
			Element elemento = (Element)nodo1;
			
			 valor = (elemento.getElementsByTagName(clave).item(0).getTextContent());
			
	}
		return valor;
		
	}
	
	private static JSONObject cargarObject() {
		
		
		if (object==null) {
			
			JSONParser parser = new JSONParser();
		
			Object obj;
			
	
			try {
				obj = parser.parse(new FileReader("recursos/config.json"));
				object = (JSONObject) obj;
				
					
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			

		}
		return object;
	}
	public static String gestionJson(String clave) {
		
		
		object = cargarObject();
		
		String valor = (String) object.get(clave);
		
		
		return valor;
		
		
	}
	private static Properties cargarProperties() {
		
		
		
		
		try {
			
		if (prop==null) {
			prop = new Properties();
			FileInputStream input = new FileInputStream("recursos/conf.properties");
			
			
			prop.load(input);
			
		}
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}
	
	public static String  gestionPropiedades(String clave) {
		
		
		prop = cargarProperties();
	
		String propiedades = prop.getProperty(clave);
		
		
		
		
		return propiedades;
	}
}
