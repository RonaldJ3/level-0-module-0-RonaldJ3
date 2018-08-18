import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) throws Exception {

		// 1.make new robot
		Robot doom = new Robot();

		// 3. Put the robot's pen down
		doom.penDown();

		// 6. Make the robot move as fast as possible
		doom.setSpeed(100);

		// 5. Do everything below here 4 times

		// 2. Move your robot 200 pixels
		doom.move(90);
		doom.turn(90);
		doom.move(90);
		doom.turn(90);
		doom.move(90);
		doom.turn(90);
		doom.move(90);
		// 4. Turn the robot 90 degrees to the right (90 degrees)
		doom.turn(90);
		doom.turn(180);
		doom.move(90);
		doom.penUp();
		doom.turn(-90);
		doom.move(90);
		doom.turn(45);
		doom.penDown();
		doom.move(-125);
		doom.penUp();
		doom.move(150);
	}
}