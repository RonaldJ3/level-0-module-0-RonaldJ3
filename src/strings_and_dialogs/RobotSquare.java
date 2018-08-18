package strings_and_dialogs;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	public static void main(String[] args) throws Exception {

		// 1.make new robot
		Robot doom = new Robot();

		// 3. Put the robot's pen down
		doom.penDown();

		// 6. Make the robot move as fast as possible
		doom.setSpeed(100);

		// 5. Do everything below here 4 times

		// 2. Move your robot 200 pixels
		doom.move(200);
		doom.turn(90);
		doom.move(200);
		doom.turn(90);
		doom.move(200);
		doom.turn(90);
		doom.move(200);
		// 4. Turn the robot 90 degrees to the right (90 degrees)
		doom.turn(90);

	}
}
