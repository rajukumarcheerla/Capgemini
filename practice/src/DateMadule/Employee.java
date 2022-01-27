package DateMadule;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
	private String name;
	private LocalDate LocalDateTime;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", LocalDateTime=" + LocalDateTime + "]";
	}

	public Employee(String name, LocalDate localDateTime) {
		super();
		this.name = name;
		LocalDateTime = localDateTime;
	}

	public String getName() {
		return name;
	}

	public LocalDate getLocalDateTime() {
		return LocalDateTime;
	}

}
