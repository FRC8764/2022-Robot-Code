// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/*
 * This is a demo program showing the use of the RobotDrive class, specifically it contains the code
 * necessary to operate a robot with tank drive.
 */
public class Robot extends TimedRobot {
  private DifferentialDrive m_myRobot;
  private Joystick m_leftStick;
  private Joystick m_rightStick;
  private XboxController = m_driverController

  @Override
  public void robotInit() {
    // SpeedController m_frontLeft = new PWMVictorSPX(0);
    // SpeedController m_rearLeft = new PWMVictorSPX(1);
    // SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

    // SpeedController m_frontRight = new PWMVictorSPX(2);
    // SpeedController m_rearRight = new PWMVictorSPX(3);
    // SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);

    // DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);

    m_myRobot = new DifferentialDrive(new PWMVictorSPX(0), new PWMVictorSPX(1));
    m_driverController = new XboxController(0);
    m_leftStick = new Joystick(0);
    m_rightStick = new Joystick(1);
  }

  @Override
  public void testInit(){}

  @Override
  public void testPeriodic(){}

  @Override
  public void teleopInit(){

  }

  @Override
  public void teleopPeriodic() {
    //m_myRobot.tankDrive(m_leftStick.getY(), m_rightStick.getY());
    m_myRobot.tankDrive(m_driverController.getLeftY(), m_driverController.getRightY());
    m_myRobot.tankDrive(m_driverController.getY(Hand.kLeft), m_driverController.getY(Hand.kRight))
  }

  @Override
  public void autonomousInit(){

  }

  @Override
  public void autonomousPeriodic() {

  }
}
