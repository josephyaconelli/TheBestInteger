
public class Main {

	public static void main(String[] args) {

	
		BetterInteger n = new BetterInteger(5);
		BetterInteger m = new BetterInteger(3);

		
		System.out.println(n.getNum());
		n.add(m);
		System.out.println(n.getNum());
		n.increaseInt();
		System.out.println(n.getNum());
		n.decreaseInt();
		System.out.println(n.getNum());
		n.increaseBy(7);
		System.out.println(n.getNum());


	
	}

}
