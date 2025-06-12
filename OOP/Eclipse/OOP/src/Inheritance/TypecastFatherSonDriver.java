package Inheritance;

public class TypecastFatherSonDriver {
	public static void main(String[] args) {
		TypecastFather f1=new TypecastSon(); //UpCasting
		f1.Drinking();
//		f1.Smoking(); //CTE

		
	TypecastSon s1 = (TypecastSon) f1 ; //DownCasting
//		
		s1.Drinking();
		s1.Smoking(); 
		
		// ClassCast Exception
		
//	TypecastFather f1 = new TypecastFather();
//		TypecastSon s1 = (TypecastSon)f1; //class cast Exception 
//		
//		s1.Smoking();
//		s1.Drinking();
		
		
		
		//Experiment
		
//		TypecastGrandfather f1=new TypecastSon(); //UpCasting
////		f1.Drinking(); //CTE
////		f1.Smoking(); //CTE
//			f1.Outing();
		
		
		
//		TypecastFather s1 = (TypecastFather) f1 ; //DownCasting
//		s1.Outing();
//		s1.Drinking();
//		s1.Smoking();  //CTE
		
		
		
//		TypecastSon s2 = (TypecastSon) s1 ; //DownCasting
////		
//		s2.Drinking();
//		s2.Smoking(); 
//		s2.Outing();
		
		
	}
}
