class BloodData{
	String bloodType;
	String rhFactor;
	
public BloodData(){
	bloodType = ("O");
	rhFactor = ("+");
}
public BloodData(String bt, String rh){
	this.bloodType = bt;
	this.rhFactor = rh;
}
public void display(){
	System.out.println(bloodType + rhFactor + " is added to the blood bank.");
}
	
	
	
	
	
	
	
	
}