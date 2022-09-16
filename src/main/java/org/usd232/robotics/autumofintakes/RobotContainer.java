package org.usd232.robotics.autumofintakes;

import edu.wpi.first.wpilibj.Joystick;
import org.usd232.robotics.autumofintakes.commands.ExampleCommand;
import org.usd232.robotics.autumofintakes.log.Logger;
import org.usd232.robotics.autumofintakes.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import static org.usd232.robotics.autumofintakes.Constants.*;

public class RobotContainer {
    /**
     * The logger.
     * 
     * @since 2018
     */
    //@SuppressWarnings("unused")
    private static final Logger LOG = new Logger();
    
    private final DriveSubsystem m_driveSubsystem = new DriveSubsystem();

    private final ExampleCommand m_autoCommand = new ExampleCommand(m_driveSubsystem);

    @SuppressWarnings("unused")
    private final Joystick movementJoystick = LOG.catchAll(() -> new Joystick(OIConstants.LEFT_JOYSTICK));
    @SuppressWarnings("unused")
    private final Joystick rotationJoystick = LOG.catchAll(() -> new Joystick(OIConstants.RIGHT_JOYSTICK));

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
    public RobotContainer() {
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
        return m_autoCommand;
    }
}
