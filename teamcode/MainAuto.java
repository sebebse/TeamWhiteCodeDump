package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
//Not yet tested
//R - right L - left B - back F - front m - motor r - servo S - stick

@TeleOp
public class MainAuto extends LinearOpMode {
    private DcMotor RFm;
    private DcMotor LFm;
    private DcMotor RBm;
    private DcMotor LBm;
    
    @Override
    public void runOpMode() {
        RFm = hardwareMap.get(DcMotor.class, "RFm");
        LFm = hardwareMap.get(DcMotor.class, "LFm");
        RBm = hardwareMap.get(DcMotor.class, "RBm");
        LBm = hardwareMap.get(DcMotor.class, "LBm");
        //love yourself
        waitForStart();
        while (opModeIsActive()) {
            //uses meccanum wheels to go right and waits 2500ms before stopping
            RFm.setPower(-1);
            LFm.setPower(1);
            RBm.setPower(1);
            LBm.setPower(-1);
            sleep(2500);
            break;
        }
    }
}
