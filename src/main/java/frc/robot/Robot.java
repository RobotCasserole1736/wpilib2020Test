/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.lib.Calibration.CalWrangler;
import frc.lib.DataServer.CasseroleDataServer;
import frc.lib.WebServer.CasseroleWebServer;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  
  CasseroleWebServer webserver;
  CalWrangler wrangler;
  CasseroleDataServer dataServer;

  //CANSparkMax testSparkMax;

  @Override
  public void robotInit() {

    /* Init website utilties */
    webserver = new CasseroleWebServer();
    wrangler = new CalWrangler();
    dataServer = CasseroleDataServer.getInstance();

    dataServer.startServer();
    webserver.startServer();

    //testSparkMax = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);

  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
    //testSparkMax.set(0.930);
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    //testSparkMax.set(0.254);
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
