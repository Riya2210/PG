package pg;

public class BaseClass extends FlowOfExecution {
	int id;
	BaseClass() {
		System.out.println("within base constructor");
	}
BaseClass(int id){
	this.id = id;
}
void get(){
	System.out.println(id);
}
	{
		System.out.println("nonstatic1");
	}
	static {
		System.out.println("static1");
	}

	void display() {
		System.out.println("display");
	}

	public static void main(String[] args) {
		System.out.println("main");
		BaseClass b = new BaseClass();
		BaseClass b1 = new BaseClass(10);
		
		b.eat();
		b.display();
		b1.get();
	}
}
