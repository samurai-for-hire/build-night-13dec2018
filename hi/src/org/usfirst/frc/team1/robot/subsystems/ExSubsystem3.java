package org.usfirst.frc.team1.robot.subsystems;

import org.usfirst.frc.team1.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExSubsystem3 extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private Victor motorThree;
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	
	public ExSubsystem3() {
		motorThree = new Victor(RobotMap.motorThreeID);
	}	
}

