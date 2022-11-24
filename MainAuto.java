package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp

public class MainTele extends LinearOpMode {
    private DcMotor rightmotor;
    private DcMotor leftmotor;
    private DcMotor righttmotor;
    private DcMotor lefttmotor;
    
    @Override
    public void runOpMode() {
        rightmotor = hardwareMap.get(DcMotor.class, "right1");
        leftmotor = hardwareMap.get(DcMotor.class, "left1");
        righttmotor = hardwareMap.get(DcMotor.class, "right2");
        lefttmotor = hardwareMap.get(DcMotor.class, "left2");
        
        waitForStart();
        
        while (opModeIsActive()) {
            rightmotor.setPower(1);
            leftmotor.setPower(1);
            righttmotor.setPower(1);
            lefttmotor.setPower(1);
        }
    }
}
