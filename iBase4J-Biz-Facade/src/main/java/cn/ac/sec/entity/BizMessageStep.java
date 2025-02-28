package cn.ac.sec.entity;

import java.io.Serializable;
import java.util.Date;

public class BizMessageStep implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_message_step.id_
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_message_step.user_
     *
     * @mbggenerated
     */
    private Long user;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_message_step.time_
     *
     * @mbggenerated
     */
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_message_step.count_
     *
     * @mbggenerated
     */
    private Integer count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_message_step.upload_date
     *
     * @mbggenerated
     */

    private Date uploadDate;


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_message_step
     *
     * @mbggenerated
     */
    public BizMessageStep(Long id, Long user, Date time, Integer count, Date uploadDate) {
        this.id = id;
        this.user = user;
        this.time = time;
        this.count = count;
        this.uploadDate = uploadDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_message_step
     *
     * @mbggenerated
     */
    public BizMessageStep() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_message_step.id_
     *
     * @return the value of biz_message_step.id_
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_message_step.id_
     *
     * @param id the value for biz_message_step.id_
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_message_step.user_
     *
     * @return the value of biz_message_step.user_
     *
     * @mbggenerated
     */
    public Long getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_message_step.user_
     *
     * @param user the value for biz_message_step.user_
     *
     * @mbggenerated
     */
    public void setUser(Long user) {
        this.user = user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_message_step.time_
     *
     * @return the value of biz_message_step.time_
     *
     * @mbggenerated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_message_step.time_
     *
     * @param time the value for biz_message_step.time_
     *
     * @mbggenerated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_message_step.count_
     *
     * @return the value of biz_message_step.count_
     *
     * @mbggenerated
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_message_step.count_
     *
     * @param count the value for biz_message_step.count_
     *
     * @mbggenerated
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_message_step.upload_date
     *
     * @return the value of biz_message_step.upload_date
     *
     * @mbggenerated
     */
    public Date getUploadDate() {
        return uploadDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_message_step.upload_date
     *
     * @param uploadDate the value for biz_message_step.upload_date
     *
     * @mbggenerated
     */
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }
}