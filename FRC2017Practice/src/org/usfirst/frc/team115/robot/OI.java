package org.usfirst.frc.team115.robot;

import org.usfirst.frc.team115.robot.commands.Climb;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick joystick;
	JoystickButton climb;
	
	public OI() {
		joystick = new Joystick(0);
		climb = new JoystickButton(joystick, 0);
		climb.whenPressed(new Climb());
	}
	
	public Joystick getJoystick() {
		return joystick;
	}
	
	public boolean climbPressed() {
		return climb.get();
	}
}
