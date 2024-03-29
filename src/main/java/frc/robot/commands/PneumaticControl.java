/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class PneumaticControl extends Command {
  public PneumaticControl() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.PneumaticTest);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called Every time through teleop when this Command is scheduled to run
  @Override
  Robot.PneumaticTest.set(1);
  }

  //Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  //Kill Pneumatics When isFinished() returns true
  @Override
  protected void end() {
    Robot.PneumaticTest.set(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    this.end();
  }
}
