package soundSystem;

import org.mockito.internal.matchers.Null;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2018-02-03.
 */
@Component
public class LongshunSing implements CompactDisc {

    private Model1 testModel;
    public LongshunSing(Model1 test){
        this.testModel = test;
    }
    public static void main(String[] args) {
        Model1 model1 = new Model1();
        LongshunSing longshunSing = new LongshunSing(model1);
        longshunSing.play();
    }
    public void play() {
        testModel.sp1();
    }
}
