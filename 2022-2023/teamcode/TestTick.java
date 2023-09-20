package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous

public class TestTick extends LinearOpMode{
    private DcMotor FAm;
    @Override
    public void runOpMode() {
        FAm = hardwareMap.get(DcMotor.class, "FAm");
        waitForStart();
        FAm.setDirection(DcMotor.Direction.REVERSE);
        FAm.setTargetPosition(1000);
        //FAm.setVelocity(200);
        while (opModeIsActive()){
            FAm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            sleep(2000);
            break;
            
        }
    }
}