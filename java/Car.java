package JavaActivity1_1;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car(){
		tyres=4;
		doors=4;
	}
	public void displayCharacteristics(){ 
		System.out.println(" displays the values of all the variables");}
	public void accelarate() {
		System.out.println("Car is moving forward.");}
	public void brake() { 
		System.out.println("Car has stopped.");}
}
