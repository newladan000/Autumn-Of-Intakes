package org.usd232.robotics.autumnofintakes.subsystems;

import org.usd232.robotics.autumnofintakes.log.Logger;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static org.usd232.robotics.autumnofintakes.Constants.*;

// https://drive.google.com/file/d/1L3HFG1faKJ7LC5MNRQro7GX06wvOmHof/view?usp=sharing

public class DriveSubsystem extends SubsystemBase {
    /**
     * The logger.
     *
     * @since 2018
     */
    // @SuppressWarnings("unused")
    private static final Logger LOG = new Logger();

    private final Talon leftMotor;
    private final Talon rightMotor;
    private final DifferentialDrive differentialDrive;

    public DriveSubsystem() {
        leftMotor = LOG.catchAll(() -> new Talon(DriveConstants.LEFT_MOTOR));
        rightMotor = LOG.catchAll(() -> new Talon(DriveConstants.RIGHT_MOTOR));

        this.differentialDrive = new DifferentialDrive(leftMotor, rightMotor);
    }

    public void drive(double left, double right){
        differentialDrive.tankDrive(left, right);
    }
}