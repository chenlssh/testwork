package spittr.data;

import spittr.model.DailyReport;

import java.util.List;

/**
 * Created by admin on 2018-07-09.
 */
public interface DailyReportRepository {
    List<DailyReport> findDailyReportByUser(String userName);
}
