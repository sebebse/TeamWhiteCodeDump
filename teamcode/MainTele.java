package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
//Not yet tested
//R - right L - left B - back F - front m - motor r - servo S - stick
@TeleOp
public class MainTele extends OpMode {
    //declares variables that will be used for motors, sensors, servos, etc
    private DcMotor RFm;
    private DcMotor LFm;
    private DcMotor RBm;
    private DcMotor LBm;
    private DcMotor FAm;
    private Servo SVm;
    
    // public void init() {} : this is the code that runs when you press init on the driver station 
    @Override
    public void init() {
        //gives the variables that were assigned before a value
        RFm = hardwareMap.get(DcMotor.class, "RFm");
        LFm = hardwareMap.get(DcMotor.class, "LFm");
        RBm = hardwareMap.get(DcMotor.class, "RBm");
        LBm = hardwareMap.get(DcMotor.class, "LBm");
        FAm = hardwareMap.get(DcMotor.class, "FAm");
        SVm = hardwareMap.get(Servo.class, "SVm");
        //sets direction of the motors
        RFm.setDirection(DcMotor.Direction.REVERSE);
        LFm.setDirection(DcMotor.Direction.REVERSE);
        RBm.setDirection(DcMotor.Direction.REVERSE);
        LBm.setDirection(DcMotor.Direction.REVERSE);
    }
    //public void loop() {} : this is the code that loops when you press the play button on the driver station
    @Override
    public void loop() {
        //these two variables are for the joysticks, they're declared and given a value in the loop because their value need to be constantly be updated
        double LS = gamepad1.left_stick_y;
        double RS = gamepad1.right_stick_y;
        
        if (gamepad1.dpad_left) {
            LFm.setPower(-1);
            LBm.setPower(1);
            RFm.setPower(1);
            RBm.setPower(-1);
        } else if (gamepad1.dpad_right) {
            LFm.setPower(1);
            LBm.setPower(-1);
            RFm.setPower(-1);
            RBm.setPower(1);
        }  
        else{
            LFm.setPower(-LS);
            LBm.setPower(-LS);
            RFm.setPower(RS);
            RBm.setPower(RS);
        }
    }
}