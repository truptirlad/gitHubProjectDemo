package gitHub;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] myIntArray = new int[10];
//		
//		myIntArray[0] = 100;
//		myIntArray[1] =200;
//		myIntArray[2] = 300;
//		
//		System.out.println("Array Index 0 - " + myIntArray[0]);
//		System.out.println("Array Index 1 - " + myIntArray[1]);
//		System.out.println("Array Index 2 - " + myIntArray[2]);
//		System.out.println("Array Index 3 - " + myIntArray[3]);
//		
//		String[] myStringArray = new String[10];
//		
//		myStringArray[0] = "BMW";
//		myStringArray[1] ="Audi";
//		myStringArray[2] = "Benz";
//		
//		System.out.println("Array Index 0 - " + myStringArray[0]);
//		System.out.println("Array Index 1 - " + myStringArray[1]);
//		System.out.println("Array Index 2 - " + myStringArray[2]);
//		System.out.println("Array Index 3 - " + myStringArray[3]);
//		
		String[] myStringArray = {"BMW","Audi","Benz"};
//		
//		int leg = myStringArray.length;
//		
//		for(int i=0;i<leg;i++) {
//			
//			System.out.println("Array Index " + i + "-"  + myStringArray[i]);	
//		}
//		
      for (String i : myStringArray) {
    	  System.out.println(i);
      }
      
		
		
	}
}