package org.usfirst.frc.team6742.robot.subsystems;

import org.usfirst.frc.team6742.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class drivetrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	//http://first.wpi.edu/FRC/roborio/release/docs/java/
	Spark mLeft1 = new Spark(RobotMap.mLeftDrive1);
	Spark mLeft2 = new Spark(RobotMap.mLeftDrive2);
	SpeedControllerGroup mLeft = new SpeedControllerGroup(mLeft1, mLeft2);
	Spark mRight1 = new Spark(RobotMap.mRightDrive1);
	Spark mRight2 = new Spark(RobotMap.mRightDrive2);
	SpeedControllerGroup mRight = new SpeedControllerGroup(mRight1, mRight2); 

	DifferentialDrive drive = new DifferentialDrive(mLeft, mRight);
	
	public DifferentialDrive getDrive() {
		return drive;
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

