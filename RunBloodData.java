import java.util.Scanner;

public class RunBloodData{
	public static void main(String[] args){
	Scanner bb = new Scanner(System.in);
	BloodData bdb = new BloodData();
			
	System.out.print("Enter blood type of patient: ");
		String bldtyp = bb.next();
			if (bldtyp.equals("O")){
				bdb = new BloodData();
			}
			else if (bldtyp.equals("A")){
				bdb = new BloodData();
			}
			else if (bldtyp.equals("B")){
				bdb = new BloodData();
			}
			else if (bldtyp.equals("AB")){
				bdb = new BloodData();
			}
			else {
				System.out.println("Invalid blood type.");
				return;
			}
			
	System.out.print("Enter the Rhesus factor (+ or -): ");
		String rhssfctr = bb.next();
		
BloodData bd = new BloodData(bldtyp, rhssfctr);			
	bd.display();		
		
}
}