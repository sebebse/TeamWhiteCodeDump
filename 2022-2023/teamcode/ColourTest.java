package org.firstinspires.ftc.teamcode;
 
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
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
            
            //give the colour sensor time to stablilize output
            sleep(3000);
            
            //red is higher than all other values
            if (csf.red() > csf.blue() && csf.red() > csf.green()) {
                telemetry.addData("red is highest", csf.red());
                telemetry.update();
                sleep(3000);
            }
            if (csf.blue() > csf.red() && csf.blue() > csf.green()) {
                telemetry.addData("blue is highest", csf.blue());
                telemetry.update();
                sleep(3000);
            }
            else{
                telemetry.addData("Red", csf.red());
                telemetry.addData("Green", csf.green());
                telemetry.addData("Blue", csf.blue());
                telemetry.update();
            }
        }
    }
}
