package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
//Not yet tested
@TeleOp
public class MainTele extends OpMode {

    private DcMotor RFm;
    private DcMotor LFm;
    private DcMotor RBm;
    private DcMotor LBm;

    @Override
    public void init() {
        RFm = hardwareMap.get(DcMotor.class, "RFm");
        LFm = hardwareMap.get(DcMotor.class, "LFm");
        RBm = hardwareMap.get(DcMotor.class, "RBm");
        LBm = hardwareMap.get(DcMotor.class, "LBm");
        
        RFm.setDirection(DcMotor.Direction.REVERSE);
        LFm.setDirection(DcMotor.Direction.REVERSE);
        RBm.setDirection(DcMotor.Direction.REVERSE);
        LBm.setDirection(DcMotor.Direction.REVERSE);
    }
    @Override
    public void loop() {
        double LS = gamepad1.left_stick_y;
        double RS = gamepad1.right_stick_y;
        LFm.setPower(LS);
        LBm.setPower(LS);
        RFm.setPower(RS);
        RBm.setPower(RS);
    }

}
