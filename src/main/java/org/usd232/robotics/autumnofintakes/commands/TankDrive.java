package org.usd232.robotics.autumnofintakes.commands;

import org.usd232.robotics.autumnofintakes.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class TankDrive extends CommandBase {
    private final DriveSubsystem driveSubsystem;
    private final double left;
    private final double right;

    /**
     * Creates a new ExampleCommand.
     *
     * @param subsystem The subsystem used by this command.
     */
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
        driveSubsystem.drive(0,0);
    }
}