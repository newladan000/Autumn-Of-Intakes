package org.usd232.robotics.autumnofintakes.commands;

import org.usd232.robotics.autumnofintakes.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import io.github.oblarg.oblog.annotations.Log;

public class TankDrive extends CommandBase {

    private final DriveSubsystem driveSubsystem;

    @Log // log the inputs to see if they show up
    private final double left;
    @Log // TODO: might spam shuffleboard
    private final double right;

    public TankDrive(double left, double right, DriveSubsystem driveSubsystem) {

        this.left = left;
        this.right = right;
        this.driveSubsystem = driveSubsystem;

        addRequirements(driveSubsystem);
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        driveSubsystem.drive(left, right);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        driveSubsystem.drive(0, 0);
    }
}