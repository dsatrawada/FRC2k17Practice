package org.usfirst.frc.team115.robot.subsystems;

import org.usfirst.frc.team115.robot.Robot;
import org.usfirst.frc.team115.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	Victor frontLeft, backLeft, frontRight, backRight;
	RobotDrive drive;
	
	public DriveTrain() {
	 	frontLeft = new Victor(0);
		backLeft = new Victor(1);
		frontRight = new Victor(2);
		backRight = new Victor(3);
		drive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
	}
	
	public void drive() {
		drive.arcadeDrive(Robot.oi.getJoystick());
	}
	
	public void stop() {
		drive.stopMotor();
	}
	
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveWithJoystick());
	}
}
