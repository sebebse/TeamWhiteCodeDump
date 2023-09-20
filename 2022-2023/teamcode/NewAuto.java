package org.firstinspires.ftc.teamcode;
//Good job :)
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous

public class NewAuto extends LinearOpMode {
    private DcMotor FAm;
    private DcMotor LBm;
    private DcMotor LFm;
    private DcMotor RBm;
    private DcMotor RFm;
    private Servo LSv;
    private Servo RSv;
    ColorSensor csf;
    
    @Override
    public void runOpMode() {
        //Right Front motor, Front Arm motor, Left Servo, etc
        RFm = hardwareMap.get(DcMotor.class, "RFm");
        LFm = hardwareMap.get(DcMotor.class, "LFm");
        RBm = hardwareMap.get(DcMotor.class, "RBm");
        LBm = hardwareMap.get(DcMotor.class, "LBm");
        FAm = hardwareMap.get(DcMotor.class, "FAm");
        LSv = hardwareMap.get(Servo.class, "LSv");
        RSv = hardwareMap.get(Servo.class, "RSv");
        csf = hardwareMap.get(ColorSensor.class, "csf");
        
        waitForStart();
        while (opModeIsActive()) {
            
            //give the colour sensor time to stablilize output
            sleep(3000);
            
            //red is higher than all other values
            if (csf.red() > csf.blue() && csf.red() > csf.green()) {
                telemetry.addData("red is highest", csf.red());
                telemetry.update();
                sleep(3000);
                /*
                LFm.setPower(1);
                LBm.setPower(1);
                RFm.setPower(1);
                RBm.setPower(1);
                sleep(number);
                FAm.setPower(1);
                sleep(number);
                FAm.setPower(0.1);
                LSv.setPosition(1);
                RSv.setPosition(-1);
                */
            } 
            //if blue is higher than all other values
            if (csf.blue() > csf.red() && csf.blue() > csf.green()) {
                telemetry.addData("blue is highest", csf.blue());
                telemetry.update();
                sleep(3000);
                /*
                LFm.setPower(1);
                LBm.setPower(1);
                RFm.setPower(1);
                RBm.setPower(1);
                sleep(number);
                FAm.setPower(1);
                sleep(number);
                FAm.setPower(0.1);
                LSv.setPosition(1);
                RSv.setPosition(-1);
                */
            } 
            //if green is higher than all other values
            if (csf.green() > csf.blue() && csf.green() > csf.red()) {
                telemetry.addData("green is highest", csf.green());
                telemetry.update();
                sleep(3000);
                /*
                LFm.setPower(1);
                LBm.setPower(1);
                RFm.setPower(1);
                RBm.setPower(1);
                sleep(number);
                FAm.setPower(1);
                sleep(number);
                FAm.setPower(0.1);
                LSv.setPosition(1);
                RSv.setPosition(-1);
                */
            }
            else {
                telemetry.addData("Red", csf.red());
                telemetry.addData("Green", csf.green());
                telemetry.addData("Blue", csf.blue());
                telemetry.update();
            }
        }
    }
}