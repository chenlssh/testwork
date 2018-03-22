package spittr.data;

import spittr.Spitter;

/**
 * Created by admin on 2018-03-18.
 */
public interface SpitterRepository {

    Spitter save(Spitter spitter);
    Spitter findByUserName(String userName);
}
