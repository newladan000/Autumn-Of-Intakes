package org.usd232.robotics.autumnofintakes;

import edu.wpi.first.wpilibj.Joystick;
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
    //@SuppressWarnings("unused")
    private static final Logger LOG = new Logger();
    
    private final DriveSubsystem driveSubsystem = new DriveSubsystem();

    public final Joystick leftJoystick = LOG.catchAll(() -> new Joystick(OIConstants.LEFT_JOYSTICK));
    public final Joystick rightJoystick = LOG.catchAll(() -> new Joystick(OIConstants.RIGHT_JOYSTICK));

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
    public RobotContainer() {
        driveSubsystem.setDefaultCommand(new TankDrive(
            leftJoystick.getY(), 
            rightJoystick.getY(),
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
}
