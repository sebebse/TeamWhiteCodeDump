package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "OpMode (Blocks to Java)", group = "")
public class OldOpMode extends LinearOpMode {

  private DcMotor rightmotor;
  private DcMotor carosel;
  private DcMotor leftmotor;
  private DcMotor fly_wheel;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    rightmotor = hardwareMap.dcMotor.get("rightmotor");
    carosel = hardwareMap.dcMotor.get("carosel ");
    leftmotor = hardwareMap.dcMotor.get("leftmotor");
    fly_wheel = hardwareMap.dcMotor.get("fly_wheel");

    // Reverse one of the drive motors.
    // You will have to determine which motor to reverse for your robot.
    // In this example, the right motor was reversed so that positive
    // applied power makes it move the robot in the forward direction.
    rightmotor.setDirection(DcMotorSimple.Direction.REVERSE);
    // You will have to determine which motor to reverse for your robot.
    // In this example, the right motor was reversed so that positive
    // applied power makes it move the robot in the forward direction.
    carosel.setDirection(DcMotorSimple.Direction.REVERSE);
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        if (gamepad1.a) {
          carosel.setPower(1);
        } else {
          carosel.setPower(0);
        }
        
        if (gamepad1.b) {
          fly_wheel.setPower(1);
        } else {
          fly_wheel.setPower(0);
        }
        // Put loop blocks here.
        // The Y axis of a joystick ranges from -1 in its topmost position
        // to +1 in its bottommost position. We negate this value so that
        // the topmost position corresponds to maximum forward power.
        rightmotor.setPower(-gamepad1.left_stick_y);
        leftmotor.setPower(-gamepad1.right_stick_y);
        telemetry.addData("Left Power", leftmotor.getPower());
        telemetry.addData("Right Power", rightmotor.getPower());
        telemetry.addData("Carosel Power", carosel.getPower());
        telemetry.addData("Fly_wheel Power", fly_wheel.getPower());
        telemetry.update();
      }
    }
  }
}
