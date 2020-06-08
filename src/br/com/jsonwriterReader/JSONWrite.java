package br.com.jsonwriterReader;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class JSONWrite {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		JSONObject jsonObject = new JSONObject();
		
		FileWriter writeFile = null;
		
		jsonObject.put("nome", "Felipe");
		jsonObject.put("sobrenome", "Januário");
		jsonObject.put("pais", "Brasil");
		jsonObject.put("estado", "RJ");
		
		
		try {
			writeFile = new FileWriter("C:/Users/felipe.a.januario/Desktop/saida.json");
			writeFile.write(jsonObject.toString());
			writeFile.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}	
		
		System.out.println(jsonObject);
	}	
}
