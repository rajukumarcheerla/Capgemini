package DateMadule;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class FileWritter {
	public static void main(String[] args) {
		try {
			FileWritter fw=new FileWritter("C:\\raju.txt");
			BufferedWriter bf=new BufferedWriter(fw);
					bf.write("raju");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
