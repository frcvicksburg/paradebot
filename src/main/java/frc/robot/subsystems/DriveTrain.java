/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.DigitalInput;
/**
 * Subsystem - Do your thing!
 */
public class DriveTrain extends Subsystem {
  //NEW DRIVE MOTORS (Uses Talon Controllers)
  private Talon leftMotor1 = new Talon(RobotMap.MOTOR_LEFT_1_ID);
  private Talon rightMotor1 = new Talon(RobotMap.MOTOR_RIGHT_1_ID);
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
   setDefaultCommand(new TankDrive());
  }

  public void setLeftMotors(double speed) {
    leftMotor1.set(speed);
  }

  public void setRightMotors(double speed) {
    rightMotor1.set(speed);
  }
}
