/*package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Blinker;
import com.qualcomm.robotcore.hardware.Gyroscope;

@TeleOp

public class ColourTest {
    private Blinker expansion_Hub_2;

    // todo: write your code here
}
*/
package org.firstinspires.ftc.teamcode;
 
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
 
@TeleOp
public class ColourTest extends LinearOpMode {
    // Define a variable for our color sensor
    ColorSensor csf;
    
    @Override
    public void runOpMode() {
        // Get the color sensor from hardwareMap
        csf = hardwareMap.get(ColorSensor.class, "csf");
        
        // Wait for the Play button to be pressed
        waitForStart();
 
        // While the Op Mode is running, update the telemetry values.
        while (opModeIsActive()) {
            telemetry.addData("Red", csf.red());
            telemetry.addData("Green", csf.green());
            telemetry.addData("Blue", csf.blue());
            telemetry.update();
        }
    }
}
