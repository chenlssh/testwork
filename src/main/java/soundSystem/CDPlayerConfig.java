package soundSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by admin on 2018-02-03.
 */
@Configuration
@ComponentScan
public class CDPlayerConfig {

    //@Bean
    public CompactDisc ompactDisc(){
        return  new SgtPeppers();
    }
}
