package frc.robot.subsystems;

import frc.robot.Constants.IntakeConstants;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
   
    private boolean isIntakeOn = false; // Move this line to the top of the class

    int kHighIntakeID = 1; // Replace 1 with the actual value of kHighIntakeID
    int kLowIntakeID = 2; // Replace 2 with the actual value of kLowIntakeID
    
    CANSparkMax m_highintake = new CANSparkMax(kHighIntakeID, MotorType.kBrushless);
    CANSparkMax m_lowintake = new CANSparkMax(kLowIntakeID, MotorType.kBrushless);
    
    public void sethighintake(double speed) {
      
    }
    
    public void setlowintake(double speed) {
    
    }

    public Command getIntakeCommand() {
      return new InstantCommand(() -> {
        isIntakeOn = !isIntakeOn; 
        if (isIntakeOn) {
            sethighintake(-1);
            setlowintake(1);
        } else {
            stop();
        }
      }, this); 
    }
    
    
    
    public void stop() {
      m_highintake.set(0);
      m_lowintake.set(0);
    }}
