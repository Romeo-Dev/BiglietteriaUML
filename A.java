
public class A 	{
	
	public int x;
	public String s;
	
	public A(int x, String s) {
		this.x = x;
		this.s = s;
	}
	public void metodo_a(int x) {
		this.x = x + 100;
		this.s = "abcabcabcabcabca POTENTISSIMO" + this.s;	
		System.out.println(x + s);
	}
	
	public void metodo_a(int x, int y) {} // OVERLOADING: nella stessa classe possono coesistere metodi
										// con lo stesso nome ma differenti parametri
}

