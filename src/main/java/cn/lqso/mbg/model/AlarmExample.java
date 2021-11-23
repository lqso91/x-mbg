package cn.lqso.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AlarmExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public AlarmExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAlarmTimeIsNull() {
            addCriterion("alarm_time is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIsNotNull() {
            addCriterion("alarm_time is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeEqualTo(Date value) {
            addCriterion("alarm_time =", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotEqualTo(Date value) {
            addCriterion("alarm_time <>", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeGreaterThan(Date value) {
            addCriterion("alarm_time >", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("alarm_time >=", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeLessThan(Date value) {
            addCriterion("alarm_time <", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeLessThanOrEqualTo(Date value) {
            addCriterion("alarm_time <=", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIn(List<Date> values) {
            addCriterion("alarm_time in", values, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotIn(List<Date> values) {
            addCriterion("alarm_time not in", values, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeBetween(Date value1, Date value2) {
            addCriterion("alarm_time between", value1, value2, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotBetween(Date value1, Date value2) {
            addCriterion("alarm_time not between", value1, value2, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andObjNoIsNull() {
            addCriterion("obj_no is null");
            return (Criteria) this;
        }

        public Criteria andObjNoIsNotNull() {
            addCriterion("obj_no is not null");
            return (Criteria) this;
        }

        public Criteria andObjNoEqualTo(String value) {
            addCriterion("obj_no =", value, "objNo");
            return (Criteria) this;
        }

        public Criteria andObjNoNotEqualTo(String value) {
            addCriterion("obj_no <>", value, "objNo");
            return (Criteria) this;
        }

        public Criteria andObjNoGreaterThan(String value) {
            addCriterion("obj_no >", value, "objNo");
            return (Criteria) this;
        }

        public Criteria andObjNoGreaterThanOrEqualTo(String value) {
            addCriterion("obj_no >=", value, "objNo");
            return (Criteria) this;
        }

        public Criteria andObjNoLessThan(String value) {
            addCriterion("obj_no <", value, "objNo");
            return (Criteria) this;
        }

        public Criteria andObjNoLessThanOrEqualTo(String value) {
            addCriterion("obj_no <=", value, "objNo");
            return (Criteria) this;
        }

        public Criteria andObjNoLike(String value) {
            addCriterion("obj_no like", value, "objNo");
            return (Criteria) this;
        }

        public Criteria andObjNoNotLike(String value) {
            addCriterion("obj_no not like", value, "objNo");
            return (Criteria) this;
        }

        public Criteria andObjNoIn(List<String> values) {
            addCriterion("obj_no in", values, "objNo");
            return (Criteria) this;
        }

        public Criteria andObjNoNotIn(List<String> values) {
            addCriterion("obj_no not in", values, "objNo");
            return (Criteria) this;
        }

        public Criteria andObjNoBetween(String value1, String value2) {
            addCriterion("obj_no between", value1, value2, "objNo");
            return (Criteria) this;
        }

        public Criteria andObjNoNotBetween(String value1, String value2) {
            addCriterion("obj_no not between", value1, value2, "objNo");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andAlarmDateIsNull() {
            addCriterion("alarm_date is null");
            return (Criteria) this;
        }

        public Criteria andAlarmDateIsNotNull() {
            addCriterion("alarm_date is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmDateEqualTo(Date value) {
            addCriterionForJDBCDate("alarm_date =", value, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("alarm_date <>", value, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateGreaterThan(Date value) {
            addCriterionForJDBCDate("alarm_date >", value, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("alarm_date >=", value, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateLessThan(Date value) {
            addCriterionForJDBCDate("alarm_date <", value, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("alarm_date <=", value, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateIn(List<Date> values) {
            addCriterionForJDBCDate("alarm_date in", values, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("alarm_date not in", values, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("alarm_date between", value1, value2, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andAlarmDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("alarm_date not between", value1, value2, "alarmDate");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNull() {
            addCriterion("org_no is null");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNotNull() {
            addCriterion("org_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNoEqualTo(String value) {
            addCriterion("org_no =", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotEqualTo(String value) {
            addCriterion("org_no <>", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThan(String value) {
            addCriterion("org_no >", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThanOrEqualTo(String value) {
            addCriterion("org_no >=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThan(String value) {
            addCriterion("org_no <", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThanOrEqualTo(String value) {
            addCriterion("org_no <=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLike(String value) {
            addCriterion("org_no like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotLike(String value) {
            addCriterion("org_no not like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoIn(List<String> values) {
            addCriterion("org_no in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotIn(List<String> values) {
            addCriterion("org_no not in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoBetween(String value1, String value2) {
            addCriterion("org_no between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotBetween(String value1, String value2) {
            addCriterion("org_no not between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNull() {
            addCriterion("alarm_type is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNotNull() {
            addCriterion("alarm_type is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeEqualTo(Integer value) {
            addCriterion("alarm_type =", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotEqualTo(Integer value) {
            addCriterion("alarm_type <>", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThan(Integer value) {
            addCriterion("alarm_type >", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_type >=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThan(Integer value) {
            addCriterion("alarm_type <", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_type <=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIn(List<Integer> values) {
            addCriterion("alarm_type in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotIn(List<Integer> values) {
            addCriterion("alarm_type not in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeBetween(Integer value1, Integer value2) {
            addCriterion("alarm_type between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_type not between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andReadStateIsNull() {
            addCriterion("read_state is null");
            return (Criteria) this;
        }

        public Criteria andReadStateIsNotNull() {
            addCriterion("read_state is not null");
            return (Criteria) this;
        }

        public Criteria andReadStateEqualTo(Integer value) {
            addCriterion("read_state =", value, "readState");
            return (Criteria) this;
        }

        public Criteria andReadStateNotEqualTo(Integer value) {
            addCriterion("read_state <>", value, "readState");
            return (Criteria) this;
        }

        public Criteria andReadStateGreaterThan(Integer value) {
            addCriterion("read_state >", value, "readState");
            return (Criteria) this;
        }

        public Criteria andReadStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_state >=", value, "readState");
            return (Criteria) this;
        }

        public Criteria andReadStateLessThan(Integer value) {
            addCriterion("read_state <", value, "readState");
            return (Criteria) this;
        }

        public Criteria andReadStateLessThanOrEqualTo(Integer value) {
            addCriterion("read_state <=", value, "readState");
            return (Criteria) this;
        }

        public Criteria andReadStateIn(List<Integer> values) {
            addCriterion("read_state in", values, "readState");
            return (Criteria) this;
        }

        public Criteria andReadStateNotIn(List<Integer> values) {
            addCriterion("read_state not in", values, "readState");
            return (Criteria) this;
        }

        public Criteria andReadStateBetween(Integer value1, Integer value2) {
            addCriterion("read_state between", value1, value2, "readState");
            return (Criteria) this;
        }

        public Criteria andReadStateNotBetween(Integer value1, Integer value2) {
            addCriterion("read_state not between", value1, value2, "readState");
            return (Criteria) this;
        }

        public Criteria andRegionNoIsNull() {
            addCriterion("region_no is null");
            return (Criteria) this;
        }

        public Criteria andRegionNoIsNotNull() {
            addCriterion("region_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegionNoEqualTo(String value) {
            addCriterion("region_no =", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoNotEqualTo(String value) {
            addCriterion("region_no <>", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoGreaterThan(String value) {
            addCriterion("region_no >", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoGreaterThanOrEqualTo(String value) {
            addCriterion("region_no >=", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoLessThan(String value) {
            addCriterion("region_no <", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoLessThanOrEqualTo(String value) {
            addCriterion("region_no <=", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoLike(String value) {
            addCriterion("region_no like", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoNotLike(String value) {
            addCriterion("region_no not like", value, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoIn(List<String> values) {
            addCriterion("region_no in", values, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoNotIn(List<String> values) {
            addCriterion("region_no not in", values, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoBetween(String value1, String value2) {
            addCriterion("region_no between", value1, value2, "regionNo");
            return (Criteria) this;
        }

        public Criteria andRegionNoNotBetween(String value1, String value2) {
            addCriterion("region_no not between", value1, value2, "regionNo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yxyd_alarm
     *
     * @mbg.generated do_not_delete_during_merge Tue Nov 23 17:59:19 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yxyd_alarm
     *
     * @mbg.generated Tue Nov 23 17:59:19 CST 2021
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}