/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import static frc.robot.Constants.*;

import edu.wpi.first.wpilibj.DigitalInput;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

//ekatni is intake backwards, as shooting is the reverse of grabbing
public class EkatniSubsystem extends SubsystemBase {

  /**
   * Creates a new EkatniSubsystem.
   */

  CANSparkMax leftShooterMotor;
  CANSparkMax righShooterMotor;

  public DigitalInput intakeSwitch = new DigitalInput(kIntakeLimitSwitch);

  public EkatniSubsystem() {
    //declare motors
    leftShooterMotor = new CANSparkMax(ID_LEFT_SHOOTER_MOTOR, MotorType.kBrushless);
    righShooterMotor = new CANSparkMax(ID_RIGHT_SHOOTER_MOTOR, MotorType.kBrushless);
    //reset motor
    leftShooterMotor.restoreFactoryDefaults();
    righShooterMotor.restoreFactoryDefaults();
    //set to not inverted
    leftShooterMotor.setInverted(false);
    righShooterMotor.setInverted(false);
    //set current limit
    leftShooterMotor.setSmartCurrentLimit(kCurrentLimit);
    righShooterMotor.setSmartCurrentLimit(kCurrentLimit);
  }
  public void ekatni() {

  }

  //sets speed for shooter
 public void ekatniOut() {

}
public void stop() {

}

 

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
