package frc.robot.subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class DriveTrain {
    
    WPI_TalonFX FrontLeft = new WPI_TalonFX(0); 
    WPI_TalonFX BackLeft = new WPI_TalonFX(1); 
    WPI_TalonFX FrontRight = new WPI_TalonFX(2); 
    WPI_TalonFX BackRight = new WPI_TalonFX(3); 
    

    
  MotorControllerGroup leftControllerGroup = new MotorControllerGroup(FrontLeft, BackLeft);
  MotorControllerGroup rightControllerGroup = new MotorControllerGroup(FrontRight, BackRight);

  
}
