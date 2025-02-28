package cn.ac.sec.entity;

import java.io.Serializable;
import java.util.Date;

public class BizMessageAlarm implements Serializable{

    public static final byte LOWPOWER = 1;
    public static final byte SITLONG = 2;
    public static final byte SOS = 3;
    public static final byte FANCE = 4;
    public static final byte FALLDOWn = 5;
    public static final byte HRHIGH = 6;
    public static final byte HRABNORMAL = 7;
    public static final byte BSABNORMAL = 8;
    public static final byte BOABNORMAL = 9;
    public static final byte URABNORMAL = 10;
    public static final byte DIABETES = 13;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_message_alarm.id_
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_message_alarm.user_
     *
     * @mbggenerated
     */
    private Long user;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_message_alarm.type_
     *
     * @mbggenerated
     */
    private Byte type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_message_alarm.time_
     *
     * @mbggenerated
     */
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_message_alarm.status_
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_message_alarm.process_user
     *
     * @mbggenerated
     */
    private Long processUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_message_alarm.process_content
     *
     * @mbggenerated
     */
    private String processContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_message_alarm.process_date
     *
     * @mbggenerated
     */
    private Date processDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_message_alarm.longitude_
     *
     * @mbggenerated
     */
    private Double longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_message_alarm.latitude_
     *
     * @mbggenerated
     */
    private Double latitude;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_message_alarm
     *
     * @mbggenerated
     */
    public BizMessageAlarm(Long id, Long user, Byte type, Date time, Byte status, Long processUser, String processContent, Date processDate, Double longitude, Double latitude) {
        this.id = id;
        this.user = user;
        this.type = type;
        this.time = time;
        this.status = status;
        this.processUser = processUser;
        this.processContent = processContent;
        this.processDate = processDate;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_message_alarm
     *
     * @mbggenerated
     */
    public BizMessageAlarm() {
        super();
    }

    public BizMessageAlarm(Long user, Byte type, Date time,Double latitude,Double longitude) {
        this.user = user;
        this.type = type;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_message_alarm.id_
     *
     * @return the value of biz_message_alarm.id_
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_message_alarm.id_
     *
     * @param id the value for biz_message_alarm.id_
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_message_alarm.user_
     *
     * @return the value of biz_message_alarm.user_
     *
     * @mbggenerated
     */
    public Long getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_message_alarm.user_
     *
     * @param user the value for biz_message_alarm.user_
     *
     * @mbggenerated
     */
    public void setUser(Long user) {
        this.user = user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_message_alarm.type_
     *
     * @return the value of biz_message_alarm.type_
     *
     * @mbggenerated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_message_alarm.type_
     *
     * @param type the value for biz_message_alarm.type_
     *
     * @mbggenerated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_message_alarm.time_
     *
     * @return the value of biz_message_alarm.time_
     *
     * @mbggenerated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_message_alarm.time_
     *
     * @param time the value for biz_message_alarm.time_
     *
     * @mbggenerated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_message_alarm.status_
     *
     * @return the value of biz_message_alarm.status_
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_message_alarm.status_
     *
     * @param status the value for biz_message_alarm.status_
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_message_alarm.process_user
     *
     * @return the value of biz_message_alarm.process_user
     *
     * @mbggenerated
     */
    public Long getProcessUser() {
        return processUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_message_alarm.process_user
     *
     * @param processUser the value for biz_message_alarm.process_user
     *
     * @mbggenerated
     */
    public void setProcessUser(Long processUser) {
        this.processUser = processUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_message_alarm.process_content
     *
     * @return the value of biz_message_alarm.process_content
     *
     * @mbggenerated
     */
    public String getProcessContent() {
        return processContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_message_alarm.process_content
     *
     * @param processContent the value for biz_message_alarm.process_content
     *
     * @mbggenerated
     */
    public void setProcessContent(String processContent) {
        this.processContent = processContent == null ? null : processContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_message_alarm.process_date
     *
     * @return the value of biz_message_alarm.process_date
     *
     * @mbggenerated
     */
    public Date getProcessDate() {
        return processDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_message_alarm.process_date
     *
     * @param processDate the value for biz_message_alarm.process_date
     *
     * @mbggenerated
     */
    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_message_alarm.longitude_
     *
     * @return the value of biz_message_alarm.longitude_
     *
     * @mbggenerated
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_message_alarm.longitude_
     *
     * @param longitude the value for biz_message_alarm.longitude_
     *
     * @mbggenerated
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_message_alarm.latitude_
     *
     * @return the value of biz_message_alarm.latitude_
     *
     * @mbggenerated
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_message_alarm.latitude_
     *
     * @param latitude the value for biz_message_alarm.latitude_
     *
     * @mbggenerated
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}