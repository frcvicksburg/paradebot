/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  //OUR MAPPING OF Our Variables to our Hardware ID's (PWM Channel).
  
  //Drive Motors
    public static final int MOTOR_LEFT_1_ID = 0;
    public static final int MOTOR_RIGHT_1_ID = 1;
  //Shooter Motors
    //YOU FILL THIS IN (same as above) except...
  
  //Controllers
    public static final int DRIVER_CONTROLLER_L = 0;
    public static final int DRIVER_CONTROLLER_R = 1;

  //Controller Parameters/Buttons
    public static final int LEFT_STICK_Y = 0;
    public static final int RIGHT_STICK_Y = 0;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
