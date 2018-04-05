	public class B extends A{
		 public char c;
		 
		public B(int x, String s, char c) {
			super(x,s);
			this.c = c;
		}
		
		// OVERRIDING: posso avere in piu classi diverse metodi con stesso nome e stessi parametri
		// sarà in fase di runtime che java capirà, in base al tipo dinamico dell'oggetto (= new B()), quale metodo richiamare.
		public void metodo_a(int x) {
			this.x = x + 1;
			this.s = "SCARSISSIMO" + this.s;	
			System.out.println(x + s);
			
			
		}
	}