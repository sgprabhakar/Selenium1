
public class testciti {

	public static void main(String[] args) {
		
		
			citi c1 = new citi();
		c1.name="A";
			citi c2 = new citi();
		c2.name= "B";
			citi c3 = new citi();
		c3.name= "C";
		
		//syso
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c3.name);
		
		c1=c2;
		
		System.out.println(c1.name);//B
		System.out.println(c2.name);//B
		System.out.println(c3.name);
		
		c1.name="Z";
		
		System.out.println(c1.name);//B
		System.out.println(c2.name);//B
		System.out.println(c3.name);
		
	}

}
