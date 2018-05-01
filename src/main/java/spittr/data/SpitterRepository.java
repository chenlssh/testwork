package spittr.data;

import spittr.model.Spitter;

/**
 * Created by admin on 2018-03-18.
 */
public interface SpitterRepository {

    boolean saveSpitter(Spitter spitter);

//    @Select("select * from Spitter where userName = #{userName}")
    Spitter findByUserName(String userName);
}
