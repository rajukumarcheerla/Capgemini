package inheritence;

import java.util.ArrayList;

public class HAS_A_relation {
	public static void main(String[] args) {
		school p = new school();
		p.setSalary(98989);

		student e = new student();
		e.setId(1);
		e.setName("raju");
		e.setNum(90909444l);
		e.setSc(p);

		school p1 = new school();
		p1.setSalary(98989);

		student e1 = new student();
		e1.setId(1);
		e1.setName("raju");
		e1.setNum(90909444l);
		e1.setSc(p);

		school p2 = new school();
		p2.setSalary(98989);

		student e2 = new student();
		e2.setId(1);
		e2.setName("raju");
		e2.setNum(90909444l);
		e2.setSc(p);

		ArrayList<student> list = new ArrayList<student>();
		list.add(e);
		list.add(e1);
		list.add(e2);

		//System.out.println(list);

		list.stream().filter(a -> a.getId()==1 ).forEach(a-> System.out.println(a));

	}

}

class student {
	private Integer id;
	private String name;
	private Long num;
	private school sc;

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", num=" + num + ", sc=" + sc + "]";
	}

	public school getSc() {
		return sc;
	}

	public void setSc(school sc) {
		this.sc = sc;
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

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

}

class school {
	private Integer salary;

	@Override
	public String toString() {
		return "school [salary=" + salary + "]";
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

}