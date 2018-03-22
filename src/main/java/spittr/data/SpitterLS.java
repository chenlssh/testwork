package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spitter;

/**
 * Created by admin on 2018-03-18.
 */
@Component
public class SpitterLS implements SpitterRepository {
    public Spitter save(Spitter spitter) {
        return null;
    }

    public Spitter findByUserName(String userName) {
        return new Spitter(userName,"24hour","Chen","Longshun");
    }
}
