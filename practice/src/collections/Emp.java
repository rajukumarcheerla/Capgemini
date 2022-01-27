package collections;

import java.util.Objects;

public class Emp implements Comparable<Emp> {
	private Integer id;
	private String name;
	private String gmail;

	public Emp(Integer id, String name, String gmail) {
		super();
		this.id = id;
		this.name = name;
		this.gmail = gmail;
	}
	

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


	public String getGmail() {
		return gmail;
	}


	public void setGmail(String gmail) {
		this.gmail = gmail;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", gmail=" + gmail + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(gmail, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(gmail, other.gmail) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Emp e) {
		int c=gmail.compareTo(gmail);
		if(c==0) {
			c=id.compareTo(e.id);
			if(c==0) {
				c=name.compareTo(e.name);
		}
		
	}
		return c;

	}
}