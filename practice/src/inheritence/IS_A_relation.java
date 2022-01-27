package inheritence;


public class IS_A_relation {
	public static void main(String[] args) {

		programer p = new programer();
		p.id = 44;
		p.name = "raju";
		p.salary = 900;
		p.num = 909090000l;
		
		p.method();
		p.method2();

	}
}

class employee {
	public Integer id;
	public String name;
	public Long num;

	public void method() {
		System.out.println("PERENT CLASS  "+" id= "+id+" name=" +name+ " num "+num);
	}

}

class programer extends employee {
	public float salary;

	public void method2() {
		System.out.println("CHILD CLASS "+" id= "+id+" name= "+name+" num= "+num+" salary "+salary);
	
	}
}
