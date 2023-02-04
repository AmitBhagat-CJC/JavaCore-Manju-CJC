package controlstatements;

public class Demo {

	public static void main(String[] args) {
		int num=10;// ||---> OR Operator
		
		if(num>0) {//true //outer if
			if(num<20) {
				System.out.println("No "+num +" is not less than 20");
			}
			else {
				System.out.println(" ");
			}
		}
		else {
			System.out.println("");
		}
	}

}
