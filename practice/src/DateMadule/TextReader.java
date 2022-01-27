package DateMadule;

import java.io.BufferedReader;
import java.io.FileReader;

public class TextReader {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\RACHEERL\\Desktop\\New folder\\dateofbirth.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				String[] str = line.split(" ");
				System.out.println(str[0] + " " + str[1] + " " + str[2] + " " + str[3]);
				line=br.readLine();

			}
			fr.close();
			br.close();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
