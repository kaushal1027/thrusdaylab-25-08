package thrusdaylabtest;

class Student{
	private String name;
	protected int id;
	double grade;
	public int age;

	public Boolean isPassed(double grade){
		return null;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id;
	}
}
class Undergrad extends Student{
	@Override
	public Boolean isPassed(double grade){
		if(grade>70.0)
			return true;
		return false;
	}
}
class Grad extends Student{
	@Override
	public Boolean isPassed(double grade){
		if(grade>80.0)
			return true;
		return false;
	}
}

public class Studentdetail{
	public static void main(String args[]){

		Undergrad ug = new Undergrad();
		Grad g = new Grad();

		//For undergraduate student
		ug.setName("kaushal");
		ug.setId(100);
		ug.grade = 70;
		ug.age = 19;
		System.out.println("Student name: "+ug.getName() +" Id: "+ ug.getId() +" Age: "+ ug.age +" Grade "+ ug.grade);
		if(ug.isPassed(ug.grade))
			System.out.println("Passed");
		else
			System.out.println("Failed");


		//For Graduate student
		g.setName("kaushal");
		g.setId(121);
		g.age = 20;
		g.grade=82;
		System.out.println("Student name: "+g.getName() +" Id: "+ g.getId() +" Age: "+ g.age +" Grade "+ g.grade);
		if(g.isPassed(g.grade))
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}
}