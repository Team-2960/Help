package org.usfirst.frc.team6742.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;

public class Drive {

	Spark frontLeft, frontRight, backLeft, backRight;
	
	public Drive() {
		frontLeft = new Spark(0);
		frontRight = new Spark(1);
		backRight = new Spark(2);
		backLeft = new Spark(3);
	}
	
	//To make motor go opposite way just put negative in front of speed
	public void move(double speed) {
		frontLeft.setSpeed(speed);
		frontRight.setSpeed(speed);
		backLeft.setSpeed(speed);
		frontRight.setSpeed(speed);
	}
	
}
