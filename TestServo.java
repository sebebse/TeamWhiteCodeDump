import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
//testconfig23
@TeleOp
public class TestServo extends OpMode {
    //declare servo
    private Servo testservo;

    @Override
    public void init() {

        testServo = hardwareMap.get(Servo.class, "testservo");
    }

    @Override
    public void loop() {
        if(gamepad1.a) {
            testServo.setPosition(1);
        }
        if(gamepad1.y) {
            testServo.setPosition(1);
        }
    }
}
