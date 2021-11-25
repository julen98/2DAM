package ej3;

import java.io.FileReader;
import com.opencsv.CSVReader;

public class Ej2 {
	public static void main(String[] args) {
		try {
			String archCSV = "src/ej3/Restaurants.csv";
			CSVReader csvReader = new CSVReader(new FileReader(archCSV));
			String[] fila = null;
			while((fila = csvReader.readNext()) != null) {
			    System.out.println(fila[0]
			              + " | " + fila[1]
			              + " |  " + fila[2]);
			}

			csvReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
