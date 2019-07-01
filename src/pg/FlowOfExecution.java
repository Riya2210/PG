package pg;

public class FlowOfExecution {
	public FlowOfExecution() {
		System.out.println("within constructor");
	}

	{
		System.out.println("nonstatic");
	}
	static {
		System.out.println("static");
	}

	void eat() {
		System.out.println("eat");
	}
}

