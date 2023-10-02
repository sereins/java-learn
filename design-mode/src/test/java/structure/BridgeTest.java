package structure;

import org.junit.jupiter.api.Test;
import structure.brige.Guitar;
import structure.brige.LiPerformer;
import structure.brige.Mouth;

public class BridgeTest {
    @Test
    public void testBridge(){
        LiPerformer liPerformer = new LiPerformer(new Mouth());
        liPerformer.preform();

        LiPerformer liPerformer1 = new LiPerformer(new Guitar());
        liPerformer1.preform();
    }
}
