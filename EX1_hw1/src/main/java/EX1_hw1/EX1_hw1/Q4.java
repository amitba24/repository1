package EX1_hw1.EX1_hw1;

public class Q4 {
 public static String Comapre (double a,double b,String mod) {
	 switch(mod) {
	 case "regular" :
		 if (a<b)
			 return "B";
		 else 
			 return "A";
		 
	 case "negatives" :
		 if (-a < -b)
			 return "B";
		 else 
			 return "A";
		 
	 case "reciprocals":
		 if (1/a < 1/b)
			 return "B";
		 else 
			 return "A";
		 
			 
	default:
		
	 }
	 return "error";
 }
}
