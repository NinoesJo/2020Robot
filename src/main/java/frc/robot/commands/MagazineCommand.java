
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Ultrasonic;

public class MagazineCommand extends CommandBase {

    Ultrasonic ultra = new Ultrasonic(Constants.kMagazineSonarOutput, Constants.kMagazineSonarInput);

  int ballCount = 0;
  boolean hasBallEntered = false;
  public MagazineCommand() {
  //sets sonar to send constant pulse
  ultra.setAutomaticMode(true);
  //gets the sonar's range in inches
  double range = ultra.getRangeInches();
  //determines if ball has passed sonar, sets boolean accordingly
  if(range <= 6) {
    hasBallEntered = true;
  } else {
    hasBallEntered = false;
  }
  //if ball has passed, adds one to ball count accumulator, and moves mast
  if (hasBallEntered = true) {
    ballCount++;
  } else {
  }  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}