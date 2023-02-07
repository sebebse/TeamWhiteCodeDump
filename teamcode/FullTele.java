package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Blinker;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.Gyroscope;

@TeleOp

public class FullTele extends OpMode{
    private DcMotor FAm;
    private DcMotor LBm;
    private DcMotor LFm;
    private DcMotor RBm;
    private DcMotor RFm;
    private Servo LSv;
    private Servo RSv;
    
    @Override
    public void init() {
        RFm = hardwareMap.get(DcMotor.class, "RFm");
        LFm = hardwareMap.get(DcMotor.class, "LFm");
        RBm = hardwareMap.get(DcMotor.class, "RBm");
        LBm = hardwareMap.get(DcMotor.class, "LBm");
        FAm = hardwareMap.get(DcMotor.class, "FAm");
        LSv = hardwareMap.get(Servo.class, "LSv");
        RSv = hardwareMap.get(Servo.class, "RSv");
    }
    @Override
    public void loop() {
        //these two variables are for the joysticks, they're declared and given a value in the loop because their value need to be constantly be updated
        double LS = gamepad1.left_stick_y;
        double RS = gamepad1.right_stick_y;
        FAm.setPower(0);
        
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
        } else if (gamepad1.dpad_up) {
            FAm.setPower(1);
        } else if (gamepad1.dpad_down) {
            FAm.setPower(-1);
        } else if(gamepad1.x){
            LSv.setPosition(180);
            RSv.setPosition(0);
        } else if(gamepad1.b){
            LSv.setPosition(0);
            RSv.setPosition(180);
        } else{
            LFm.setPower(LS);
            LBm.setPower(LS);
            RFm.setPower(-RS);
            RBm.setPower(-RS);
        }
        
    }
}