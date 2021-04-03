package arrays;

import org.jointheleague.graphical.robot.*;

import java.awt.AWTException;
import java.util.Random;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) throws AWTException {
	//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
		for (int i=0;i< 5;i++){
			robots[i] = new Robot();
		//4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i].setY(500);
			int r = i*210;
			robots[i].setX(10+r);
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		Random r = new Random();
		for (int i=0;i< 5;i++){
			int bob = r.nextInt(51);
			robots[i].move(bob);
		}
	}
}
