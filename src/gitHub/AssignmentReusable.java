package gitHub;

public class AssignmentReusable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] myStringArray = {"ROSE","CAT","BAT","MAT","SAT","SONG","VAN","CAR","SUN","MOON"};

		       for (String originalText : myStringArray) {
    	  System.out.println(originalText);
	    	
    	  String output1 = "";
		 for(int i = originalText.length()-1; i>=0 ; i--) {
			
			 char output = originalText.charAt(i);
				  output1 = output1 + output ;

				  System.out.println(output1);
			
		 }
		
//		 System.out.println(output1);
		}	 	     

	}
}



//	 RESULT:-
//ROSE
//E
//ES
//ESO
//ESOR
//CAT
//T
//TA
//TAC
//BAT
//T
//TA
//TAB
//MAT
//T
//TA
//TAM
//SAT
//T
//TA
//TAS
//SONG
//G
//GN
//GNO
//GNOS
//VAN
//N
//NA
//NAV
//CAR
//R
//RA
//RAC
//SUN
//N
//NU
//NUS
//MOON
//N
//NO
//NOO
//NOOM



