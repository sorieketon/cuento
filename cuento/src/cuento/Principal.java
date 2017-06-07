package cuento;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Properties properties = null;
		FileReader fr = null;
		
		System.out.println("Elegí un idioma / choose a languaje / Scegliere una lingua");
		System.out.println("for english press: 1");
		System.out.println("per italiano stampa: 2");
		System.out.println("para español pulsá: 3");
		
		
		Scanner sc = new Scanner(System.in);
		int opc = sc.nextInt();
		
		
		

		
		

if(opc == 1){
		try {
			fr = new FileReader("story_en.properties");
			properties = new Properties();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			properties.load(fr);
			String start = properties.getProperty("start");
			String end = properties.getProperty("end");
			String body = properties.getProperty("body");
			System.out.println(start);
			System.out.println(body);
			System.out.println(end);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

if(opc==2){
	try {
		fr = new FileReader("story_it.properties");
		properties = new Properties();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	try {
		properties.load(fr);
		String start = properties.getProperty("start");
		String end = properties.getProperty("end");
		String body = properties.getProperty("body");
		System.out.println(start);
		System.out.println(body);
		System.out.println(end);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
if(opc==3){

	try {
		fr = new FileReader("story_es.properties");
		properties = new Properties();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	try {
		properties.load(fr);
		String start = properties.getProperty("start");
		String end = properties.getProperty("end");
		String body = properties.getProperty("body");
	
		System.out.println(start);
		System.out.println(body);
		System.out.println(end);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}



}
