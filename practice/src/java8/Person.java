package java8;

import java.util.Date;
import java.util.Objects;

public class Person implements Comparable<Person> {

	private Date creationDate;

	public Date getCreationDate() {
		return new Date(this.creationDate.getTime());
	}

	public Person() {
		super();
	}

	Integer id;
	String name;

	public Person(Integer id, String name, Long number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}

	Long number;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", number=" + number + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(number, other.number);
	}

	@Override
	public int compareTo(Person o) {
		int c = this.id.compareTo(o.id);
		if (c == 0) {
			c = this.name.compareTo(o.name);
			{
				if (c == 0) {
					c = this.number.compareTo(o.number);
				}
			}
		}
		return c;
	}

}
