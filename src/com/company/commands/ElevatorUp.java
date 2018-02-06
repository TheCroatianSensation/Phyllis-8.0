package com.company.commands;


import edu.wpi.first.wpilibj.command.Command;

import static com.company.RobotMap.ElevatorDrive;

public class ElevatorUp extends Command {
    public ElevatorUp() {
        super("FlipperOut");
    }


    @Override
    protected void initialize() {
        super.initialize();
    }

    protected void execute() {

        ElevatorDrive.AutoDrive(0.5, 0);
    }
    protected boolean isFinished () {
        return (true);
    }
    protected void end () {
    }

    protected void interrupted () {
    }
}