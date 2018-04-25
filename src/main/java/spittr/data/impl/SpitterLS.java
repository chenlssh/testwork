package spittr.data.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spittr.data.SpitterRepository;
import spittr.model.Spitter;

/**
 * Created by admin on 2018-03-18.
 */
@Repository
public class SpitterLS implements SpitterRepository {

    private SqlSessionFactory sqlSessionFactory;


    @Autowired
    public SpitterLS(SqlSessionFactory sqlSessionFactoryBean){
        this.sqlSessionFactory = sqlSessionFactoryBean;
    }

    public Spitter save(Spitter spitter) {
        return null;
    }

    public Spitter findByUserName(String userName) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Spitter spitter = sqlSession.selectOne("spittr.data.SpitterRepository.findByUserName",userName);
        return spitter;
    }
}
