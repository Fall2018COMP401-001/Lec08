package lec08.ex6;

public class A {
	private int x;
	private int y;
	
	protected A(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int methodInA() {
		return x+y;
	}
}
