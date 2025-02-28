package cn.ac.sec.entity;

import java.io.Serializable;
import java.util.Date;

public class BizDataWatch extends BizDataWatchKey implements Serializable{
    private Date datetimeUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_data_watch_BP.user_id
     *
     * @mbggenerated
     */

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_data_watch_BP.data_
     *
     * @mbggenerated
     */
    private String data;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_data_watch_BP
     *
     * @mbggenerated
     */
    public BizDataWatch(Date datetimeMeasure, Date datetimeUpdate, Long userId, String data) {
        super(userId, datetimeMeasure);
        this.datetimeUpdate = datetimeUpdate;
        this.data = data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_data_watch_BP
     *
     * @mbggenerated
     */
    public BizDataWatch() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_data_watch_BP.datetime_update
     *
     * @return the value of biz_data_watch_BP.datetime_update
     *
     * @mbggenerated
     */
    public Date getDatetimeUpdate() {
        return datetimeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_data_watch_BP.datetime_update
     *
     * @param datetimeUpdate the value for biz_data_watch_BP.datetime_update
     *
     * @mbggenerated
     */
    public void setDatetimeUpdate(Date datetimeUpdate) {
        this.datetimeUpdate = datetimeUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_data_watch_BP.data_
     *
     * @return the value of biz_data_watch_BP.data_
     *
     * @mbggenerated
     */
    public String getData() {
        return data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_data_watch_BP.data_
     *
     * @param data the value for biz_data_watch_BP.data_
     *
     * @mbggenerated
     */
    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}
