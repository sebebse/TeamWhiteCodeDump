import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
//testconfig23
@TeleOp
public class ServoTest extends OpMode {
    //declare servo
    private Servo testServo;
    private Servo testServo2;

    @Override
    public void init() {
        testServo = hardwareMap.get(Servo.class, "LSv");
        testServo2 = hardwareMap.get(Servo.class, "RSv");
    }

    @Override
    public void loop() {
        if(gamepad1.a) {
            testServo.setPosition(0);
            testServo2.setPosition(90);
        }
        if(gamepad1.y) {
            testServo.setPosition(90);
            testServo2.setPosition(0);
        }
    }
}