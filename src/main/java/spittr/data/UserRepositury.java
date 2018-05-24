package spittr.data;

import spittr.model.User;

/**
 * Created by admin on 2018-05-22.
 */
public interface UserRepositury {

    User findByUserName(String userName);

    boolean saveUser(User user);
}
