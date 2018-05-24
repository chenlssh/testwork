package spittr.data.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spittr.data.UserRepositury;
import spittr.model.User;

/**
 * Created by admin on 2018-05-22.
 */
@Component
@Qualifier("userAction")
public class UserImpl implements UserRepositury {

    private SqlSessionFactory sqlSessionFactory;

    public UserImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findByUserName(String userName){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("spittr.data.UserRepositury.findByUserName",userName);
        return  user;
    }

    public boolean saveUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        return false;
    }
}
