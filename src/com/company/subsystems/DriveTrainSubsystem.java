package com.company.subsystems;

import com.company.RobotMap;
import com.company.commands.ArcadeDriveCommand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import static com.company.RobotMap.FlipperDrive;


public class DriveTrainSubsystem extends Subsystem {
    private DifferentialDrive MainDrive = new DifferentialDrive(RobotMap.driveLeft1, RobotMap.driveRight1);
   // private DifferentialDrive FlipperDrive = new DifferentialDrive(RobotMap.flipperLeft, RobotMap.flipperRight);
   // private DifferentialDrive ElevatorDrive = new DifferentialDrive(RobotMap.elevator, RobotMap.elevator);

    public DriveTrainSubsystem() {

    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new ArcadeDriveCommand());

    }

    public void TeleopDrive(Joystick Driver) {
        MainDrive.arcadeDrive(Driver.getY() * -.8, Driver.getX() * .8);
    }

    public void Stop() {
        MainDrive.arcadeDrive(0, 0);
    }

    public void AutoDrive(double left, double right) {
        MainDrive.tankDrive(left, right);
    }

    public void FlipperDrive(double left, double right){
       //FlipperDrive.tankDrive(left, right);
    }
   public void ElevatorDrive(double left, double right){
        //ElevatorDrive.tankDrive(left, right);
    }
}
