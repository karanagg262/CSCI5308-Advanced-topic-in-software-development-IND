public class Main {

	static Portal portal = new Portal();
	static MainTest mainTest = new MainTest();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length > 0) {
//Run test through command line
			MainTest.TestFeature();
			System.exit(1);
		} else {
//Run main portal by default
			Portal.RepeatPortal();
		}
	}
}
	