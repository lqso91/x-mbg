package cn.lqso.mbg.model;

import java.util.Date;

public class AlarmKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yxyd_alarm.alarm_time
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    private Date alarmTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yxyd_alarm.obj_no
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    private String objNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yxyd_alarm.user_name
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    private String userName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yxyd_alarm.alarm_time
     *
     * @return the value of yxyd_alarm.alarm_time
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public Date getAlarmTime() {
        return alarmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yxyd_alarm.alarm_time
     *
     * @param alarmTime the value for yxyd_alarm.alarm_time
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yxyd_alarm.obj_no
     *
     * @return the value of yxyd_alarm.obj_no
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public String getObjNo() {
        return objNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yxyd_alarm.obj_no
     *
     * @param objNo the value for yxyd_alarm.obj_no
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public void setObjNo(String objNo) {
        this.objNo = objNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yxyd_alarm.user_name
     *
     * @return the value of yxyd_alarm.user_name
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yxyd_alarm.user_name
     *
     * @param userName the value for yxyd_alarm.user_name
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}