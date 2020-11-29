package assign2;

public class Utility {

	public void printAll(Printable p[]) {  
		  for (int i = 0; i < p.length; i++) {  
		   p[i].print();  
		  }  	
}
	
	 public static void main(String[] args) {  
		  Printable p[] = new Printable[2];  
		  p[0] = new Animal();  
		  p[1] = new Shapes();  
		  Utility utility = new Utility();  
		  utility.printAll(p);  
		 }  
	
}