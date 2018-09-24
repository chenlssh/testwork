package spittr.data.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import spittr.data.DailyReportRepository;
import spittr.model.DailyReport;

import java.util.HashMap;
import java.util.List;

/**
 * Created by admin on 2018-07-09.
 */
@Service("findReport")
public class DailyReportImpl implements DailyReportRepository {
    private SqlSessionFactory sqlSessionFactory;
    public DailyReportImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public List<DailyReport> findDailyReportByUser(String userName) {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        List<DailyReport> dailyReports = null;
        HashMap param = new HashMap<String,Object>();
        dailyReports = sqlSession.selectList("spittr.data.DailyReportRepository.findDailyReportByUser",userName);
        return dailyReports;
    }
}
