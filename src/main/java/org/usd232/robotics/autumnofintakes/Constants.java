package org.usd232.robotics.autumnofintakes;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 * </p>
 * For example:
 * <pre> {@code import static org.usd232.robotics.autumnofintakes.Constants.*;} </pre>
 */
public final class Constants {
    // https://drive.google.com/file/d/1g1jBZHPf6Fq6V2tG7PFIGtjpEEV2BIGf/view?usp=sharing
    public static final class OIConstants {
        public static final int LEFT_JOYSTICK = 0;
        public static final int RIGHT_JOYSTICK = 1;
        public static final int MANIPULATOR_CONTROLLER = 2;

        public static final double DEADBAND = 0.3;
    }

    public static final class DriveConstants {
        //Drive motor ports
        public static final int RIGHT_MOTOR = 0;
        public static final int LEFT_MOTOR = 1;

        public static final boolean LEFT_MOTOR_INVERTED = false;
        public static final boolean RIGHT_MOTOR_INVERTED = false;

        /** Minimum power the motors need to move */
        // TODO: test input range
        // value from bones not blockHead
        public static final double MIN_MOTOR_INPUT = 0.3;
    }
}
