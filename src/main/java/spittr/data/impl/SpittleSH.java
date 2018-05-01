package spittr.data.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spittr.data.SpittleRepository;
import spittr.model.Spitter;
import spittr.model.Spittle;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by admin on 2018-03-08.
 */
@Component
public class SpittleSH implements SpittleRepository {
    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    public SpittleSH(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittleList = new ArrayList<Spittle>();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        HashMap<String,Object> param = new HashMap<String, Object>();
        param.put("max",max);
        param.put("count",count);
        spittleList = sqlSession.selectList("spittr.data.SpittleRepository.findSpittles",param);
        return spittleList;
    }

    public Spittle findOneSpittle(long spittleId){
        return new Spittle("SpittleSH"+spittleId,new Date(new java.util.Date().getTime()));
    }
}
