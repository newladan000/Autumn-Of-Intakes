package org.usd232.robotics.autumnofintakes.commands;

import org.usd232.robotics.autumnofintakes.log.Logger;
import org.usd232.robotics.autumnofintakes.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
    /**
     * The logger.
     *
     * @since 2018
     */
    @SuppressWarnings("unused")
    private static final Logger LOG = new Logger();

    private final DriveSubsystem driveSubsystem;

    private final double left;
    private final double right;

    public TankDrive(double left, double right, DriveSubsystem driveSubsystem) {

        this.left = left;
        this.right = right;

        this.driveSubsystem = driveSubsystem;

        addRequirements(driveSubsystem);
    }

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