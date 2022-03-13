
public class Constructors {
	String name;
	int age;
	double weight;
	
	Constructors(String name, int age, double weight){
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	void eat(){
		System.out.println(this.name+" is eating");
	}
}
