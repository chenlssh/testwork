package soundSystem;

import org.mockito.internal.matchers.Null;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2018-02-03.
 */
@Component
public class LongshunSing implements CompactDisc {

    public static void main(String[] args) {
        ((LongshunSing)null).play();
    }
    public void play() {
        System.out.printf("longshun is sing.....");
    }
}
