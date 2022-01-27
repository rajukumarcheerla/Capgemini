package DateMadule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.stream.Stream;

public class basic {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		try (
			BufferedReader bf=new BufferedReader(new InputStreamReader
					(basic.class.getResourceAsStream("C:\\Users\\RACHEERL\\Desktop\\New folder\\dateofbirth.txt")));
			Stream<String> str=bf.lines();
				){
str.map(
		line->{
						String[] s=line.split(" ");
						String name=s[0].trim();
						int year=Integer.parseInt(s[1].trim());
						Month month=Month.of(Integer.parseInt(s[2].trim() ));
						int day= Integer.parseInt(s[3].trim());
						
						Employee emp=new Employee(name, LocalDate.of(year,month,day));
						
						list.add(emp);
					);
			
						
						
		} catch (IOException e) {
			e.printStackTrace();
		}}
}
