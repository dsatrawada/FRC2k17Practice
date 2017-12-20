package org.usfirst.frc.team115.robot.commands;

import org.usfirst.frc.team115.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Climb extends Command{
	
	public Climb() {
		requires(Robot.winch);
	}

	protected void initialize() {
		
	}
	
	protected void execute() {
		Robot.winch.climb();
	}
	
	protected boolean isFinished() {
		return !(Robot.oi.climbPressed());
	}
	
	protected void end() {
		Robot.winch.stop();
	}
	
	protected void interrupted() {
		end();
	}
}