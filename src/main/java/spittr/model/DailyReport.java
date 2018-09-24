package spittr.model;

import java.sql.Date;

/**
 * Created by admin on 2018-07-09.
 */
public class DailyReport {
    private Long    serialNo;
    private String  userName;
    private String  jobContent;
    private Date    startDate;
    private Date    finishDate;
    private String  duration;
    private String  timeUint;
    private String  eventType;

    public Long getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Long serialNo) {
        this.serialNo = serialNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getJobContent() {
        return jobContent;
    }

    public void setJobContent(String jobContent) {
        this.jobContent = jobContent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTimeUint() {
        return timeUint;
    }

    public void setTimeUint(String timeUint) {
        this.timeUint = timeUint;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
