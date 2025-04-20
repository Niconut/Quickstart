package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;

public class LConstants {
    static {
        ThreeWheelConstants.forwardTicksToInches = .001989436789;
        ThreeWheelConstants.strafeTicksToInches = .001989436789;
        ThreeWheelConstants.turnTicksToInches = .001989436789;
        ThreeWheelConstants.leftY =7.5;
        ThreeWheelConstants.rightY = -7.25;
        ThreeWheelConstants.strafeX = -2.25;
        ThreeWheelConstants.leftEncoder_HardwareMapName = "lfmotor0";
        ThreeWheelConstants.rightEncoder_HardwareMapName = "rbmotor3";
        ThreeWheelConstants.strafeEncoder_HardwareMapName = "rfmotor2";
        ThreeWheelConstants.leftEncoderDirection = Encoder.REVERSE;
        ThreeWheelConstants.rightEncoderDirection = Encoder.REVERSE;
        ThreeWheelConstants.strafeEncoderDirection = Encoder.REVERSE;
    }
}




