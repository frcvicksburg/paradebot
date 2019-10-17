/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Spark;
/**
 * Subsystem - Do your thing!
 */
public class Shooter extends Subsystem {
  
  //SHOOTER MOTORS (Uses Spark Controllers)
  private Spark leftShooter = new Spark(RobotMap.SHOOTER_LEFT_1_ID); 
  private Spark rightShooter = new Spark(RobotMap.SHOOTER_RIGHT_1_ID);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
   setDefaultCommand(new TankDrive());
  }

  public void setLeftMotors(double speed) {
    leftShooter1.set(speed);
  }

  public void setRightMotors(double speed) {
    rightShooter1.set(speed);
  }
}
