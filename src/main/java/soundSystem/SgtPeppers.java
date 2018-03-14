package soundSystem;

import com.sun.swing.internal.plaf.synth.resources.synth_sv;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2018-02-03.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt Pepper's song";
    private String artist = "It's My Life";
    public void play() {
        System.out.printf("Playing"+title + " by " +artist);
    }
}
