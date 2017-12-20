package org.usfirst.frc.team115.robot.subsystems;

import org.usfirst.frc.team115.robot.commands.Climb;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Winch extends Subsystem {
	
	Victor roller;
	
	public Winch() {
		roller = new Victor(0);
	}
	
	public void climb() {
		roller.set(1);
	}
	
	public void stop() {
		roller.set(0);
	}
	
	protected void initDefaultCommand() {
		setDefaultCommand(new Climb());
	}

}
