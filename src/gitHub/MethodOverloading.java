package gitHub;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mynum = addnum(2,3);
		System.out.println(mynum);
		
		double mydoublenum = addnum(2.0,3.0);
		System.out.println(mydoublenum);
	}

	static int addnum(int x , int y) {
	     return (x+y);
}

	static double addnum(double x,double y) {
		return (x+y);
	}
}