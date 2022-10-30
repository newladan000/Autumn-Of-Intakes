package org.usd232.robotics.autumnofintakes;

import org.usd232.robotics.autumnofintakes.commands.TankDrive;
import org.usd232.robotics.autumnofintakes.log.Logger;
import org.usd232.robotics.autumnofintakes.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

import static org.usd232.robotics.autumnofintakes.Constants.*;

// https://drive.google.com/file/d/1EBKde_UrpQlax-PRKJ1Qa8nDJuIpd07K/view?usp=sharing

public class RobotContainer {
    /**
     * The logger.
     *
     * @since 2018
     */
    @SuppressWarnings("unused")
    private static final Logger LOG = new Logger();

    private final DriveSubsystem driveSubsystem = new DriveSubsystem();

    /** The container for the robot. Contains subsystems, OI devices, and commands. */
    public RobotContainer() {

        driveSubsystem.setDefaultCommand(new TankDrive(
            scaleInput(IO.leftJoystick.getY()),
            scaleInput(IO.rightJoystick.getY()),
            driveSubsystem));

        // Configure the button bindings
        configureButtonBindings();
    }

    private void configureButtonBindings() {}

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        // An ExampleCommand will run in autonomous
        return null;
    }

    /**
     * Whipple code. . .
     * make of that what you wil
     */
    private double scaleInput(double input) {
        double output = 0;
        double absoluteInput = Math.abs(input);

        if (absoluteInput > OIConstants.DEADBAND) {
            output = absoluteInput / input
                * (((1 - DriveConstants.MIN_MOTOR_INPUT) / (1 - OIConstants.DEADBAND))
                * (absoluteInput - OIConstants.DEADBAND) + DriveConstants.MIN_MOTOR_INPUT);
        }

        return output;
    }
}
