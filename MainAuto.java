package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp
//r - right l - left f - front b - back m - motor s - servo
public class MainAuto extends LinearOpMode {
    private DcMotor RFm;
    private DcMotor LFm;
    private DcMotor RBm;
    private DcMotor LBm;
    
    @Override
    public void runOpMode() {
        RFm = hardwareMap.get(DcMotor.class, "frontRight");
        LFm = hardwareMap.get(DcMotor.class, "frontLeft");
        RBm = hardwareMap.get(DcMotor.class, "backRight");
        LBm = hardwareMap.get(DcMotor.class, "backLeft");
        
        waitForStart();
        
        while (opModeIsActive()) {
            //uses meccanum wheels to go right and waits 2500ms before stopping, flip signs in power to go left
            RFm.setPower(-1);
            LFm.setPower(1);
            RBm.setPower(1);
            LBm.setPower(-1);
            sleep(2500);
            break;
        }
    }
}
