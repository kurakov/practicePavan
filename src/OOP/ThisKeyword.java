package OOP;

public class ThisKeyword {

	
	int x,y;
	
	void setData(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	void sum() {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		ThisKeyword th=new ThisKeyword();
		th.setData(10, 20);
		th.sum();
	}

}
