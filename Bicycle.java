// Java program to demonstrate the
// real-world example of Interfaces
//接口的真实使用例子
import java.io.*;

interface Vehicle {
	
	// all are the abstract methods.
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);
}
//摩托车类
class Bicycle implements Vehicle{
	
	int speed;
	int gear;
	
	// to change gear
	@Override
	public void changeGear(int newGear){
		
		gear = newGear;
	}
	
	// to increase speed
	@Override
	public void speedUp(int increment){
		
		speed = speed + increment;
	}
	
	// to decrease speed
	@Override
	public void applyBrakes(int decrement){
		
		speed = speed - decrement;
	}
	
	public void printStates() {
		System.out.println("speed: " + speed+ " gear: " + gear);
	}
}
//单车类，不同于上面
class Bike implements Vehicle {
	
	int speed;
	int gear;
	
	// to change gear
	@Override
	public void changeGear(int newGear){
		
		gear = newGear;
	}
	
	// to increase speed
	@Override
	public void speedUp(int increment){
		
		speed = speed + increment;
	}
	
	// to decrease speed
	@Override
	public void applyBrakes(int decrement){
		
		speed = speed - decrement;
	}
	
	public void printStates() {
		System.out.println("speed: " + speed
			+ " gear: " + gear);
	}
	
}
//相当于主类
class GFG {
	
	public static void main (String[] args) {
	
		// creating an instance of Bicycle
		//创建名为Bicycle的实例
		// doing some operations
		Bicycle bicycle = new Bicycle();
		bicycle.changeGear(2);
		bicycle.speedUp(8);
		bicycle.applyBrakes(1);
		
		System.out.println("Bicycle present state :");
		bicycle.printStates();
		
		// creating instance of the bike.
		//创建名为Bike的实例
		Bike bike = new Bike();
		bike.changeGear(1);
		bike.speedUp(4);
		bike.applyBrakes(3);
		
		System.out.println("Bike present state :");
		bike.printStates();
	}
}
