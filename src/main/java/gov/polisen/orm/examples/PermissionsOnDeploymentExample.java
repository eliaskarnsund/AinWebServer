package gov.polisen.orm.examples;

import java.util.ArrayList;
import java.util.List;

public class PermissionsOnDeploymentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    public PermissionsOnDeploymentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
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
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andDeploymentidIsNull() {
            addCriterion("deploymentid is null");
            return (Criteria) this;
        }

        public Criteria andDeploymentidIsNotNull() {
            addCriterion("deploymentid is not null");
            return (Criteria) this;
        }

        public Criteria andDeploymentidEqualTo(Integer value) {
            addCriterion("deploymentid =", value, "deploymentid");
            return (Criteria) this;
        }

        public Criteria andDeploymentidNotEqualTo(Integer value) {
            addCriterion("deploymentid <>", value, "deploymentid");
            return (Criteria) this;
        }

        public Criteria andDeploymentidGreaterThan(Integer value) {
            addCriterion("deploymentid >", value, "deploymentid");
            return (Criteria) this;
        }

        public Criteria andDeploymentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deploymentid >=", value, "deploymentid");
            return (Criteria) this;
        }

        public Criteria andDeploymentidLessThan(Integer value) {
            addCriterion("deploymentid <", value, "deploymentid");
            return (Criteria) this;
        }

        public Criteria andDeploymentidLessThanOrEqualTo(Integer value) {
            addCriterion("deploymentid <=", value, "deploymentid");
            return (Criteria) this;
        }

        public Criteria andDeploymentidIn(List<Integer> values) {
            addCriterion("deploymentid in", values, "deploymentid");
            return (Criteria) this;
        }

        public Criteria andDeploymentidNotIn(List<Integer> values) {
            addCriterion("deploymentid not in", values, "deploymentid");
            return (Criteria) this;
        }

        public Criteria andDeploymentidBetween(Integer value1, Integer value2) {
            addCriterion("deploymentid between", value1, value2, "deploymentid");
            return (Criteria) this;
        }

        public Criteria andDeploymentidNotBetween(Integer value1, Integer value2) {
            addCriterion("deploymentid not between", value1, value2, "deploymentid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andReadIsNull() {
            addCriterion("read is null");
            return (Criteria) this;
        }

        public Criteria andReadIsNotNull() {
            addCriterion("read is not null");
            return (Criteria) this;
        }

        public Criteria andReadEqualTo(Boolean value) {
            addCriterion("read =", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadNotEqualTo(Boolean value) {
            addCriterion("read <>", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadGreaterThan(Boolean value) {
            addCriterion("read >", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("read >=", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadLessThan(Boolean value) {
            addCriterion("read <", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadLessThanOrEqualTo(Boolean value) {
            addCriterion("read <=", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadIn(List<Boolean> values) {
            addCriterion("read in", values, "read");
            return (Criteria) this;
        }

        public Criteria andReadNotIn(List<Boolean> values) {
            addCriterion("read not in", values, "read");
            return (Criteria) this;
        }

        public Criteria andReadBetween(Boolean value1, Boolean value2) {
            addCriterion("read between", value1, value2, "read");
            return (Criteria) this;
        }

        public Criteria andReadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("read not between", value1, value2, "read");
            return (Criteria) this;
        }

        public Criteria andAdddataIsNull() {
            addCriterion("adddata is null");
            return (Criteria) this;
        }

        public Criteria andAdddataIsNotNull() {
            addCriterion("adddata is not null");
            return (Criteria) this;
        }

        public Criteria andAdddataEqualTo(Boolean value) {
            addCriterion("adddata =", value, "adddata");
            return (Criteria) this;
        }

        public Criteria andAdddataNotEqualTo(Boolean value) {
            addCriterion("adddata <>", value, "adddata");
            return (Criteria) this;
        }

        public Criteria andAdddataGreaterThan(Boolean value) {
            addCriterion("adddata >", value, "adddata");
            return (Criteria) this;
        }

        public Criteria andAdddataGreaterThanOrEqualTo(Boolean value) {
            addCriterion("adddata >=", value, "adddata");
            return (Criteria) this;
        }

        public Criteria andAdddataLessThan(Boolean value) {
            addCriterion("adddata <", value, "adddata");
            return (Criteria) this;
        }

        public Criteria andAdddataLessThanOrEqualTo(Boolean value) {
            addCriterion("adddata <=", value, "adddata");
            return (Criteria) this;
        }

        public Criteria andAdddataIn(List<Boolean> values) {
            addCriterion("adddata in", values, "adddata");
            return (Criteria) this;
        }

        public Criteria andAdddataNotIn(List<Boolean> values) {
            addCriterion("adddata not in", values, "adddata");
            return (Criteria) this;
        }

        public Criteria andAdddataBetween(Boolean value1, Boolean value2) {
            addCriterion("adddata between", value1, value2, "adddata");
            return (Criteria) this;
        }

        public Criteria andAdddataNotBetween(Boolean value1, Boolean value2) {
            addCriterion("adddata not between", value1, value2, "adddata");
            return (Criteria) this;
        }

        public Criteria andModifyIsNull() {
            addCriterion("modify is null");
            return (Criteria) this;
        }

        public Criteria andModifyIsNotNull() {
            addCriterion("modify is not null");
            return (Criteria) this;
        }

        public Criteria andModifyEqualTo(Boolean value) {
            addCriterion("modify =", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyNotEqualTo(Boolean value) {
            addCriterion("modify <>", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyGreaterThan(Boolean value) {
            addCriterion("modify >", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("modify >=", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyLessThan(Boolean value) {
            addCriterion("modify <", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyLessThanOrEqualTo(Boolean value) {
            addCriterion("modify <=", value, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyIn(List<Boolean> values) {
            addCriterion("modify in", values, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyNotIn(List<Boolean> values) {
            addCriterion("modify not in", values, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyBetween(Boolean value1, Boolean value2) {
            addCriterion("modify between", value1, value2, "modify");
            return (Criteria) this;
        }

        public Criteria andModifyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("modify not between", value1, value2, "modify");
            return (Criteria) this;
        }

        public Criteria andChangepermissionsIsNull() {
            addCriterion("changepermissions is null");
            return (Criteria) this;
        }

        public Criteria andChangepermissionsIsNotNull() {
            addCriterion("changepermissions is not null");
            return (Criteria) this;
        }

        public Criteria andChangepermissionsEqualTo(Boolean value) {
            addCriterion("changepermissions =", value, "changepermissions");
            return (Criteria) this;
        }

        public Criteria andChangepermissionsNotEqualTo(Boolean value) {
            addCriterion("changepermissions <>", value, "changepermissions");
            return (Criteria) this;
        }

        public Criteria andChangepermissionsGreaterThan(Boolean value) {
            addCriterion("changepermissions >", value, "changepermissions");
            return (Criteria) this;
        }

        public Criteria andChangepermissionsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("changepermissions >=", value, "changepermissions");
            return (Criteria) this;
        }

        public Criteria andChangepermissionsLessThan(Boolean value) {
            addCriterion("changepermissions <", value, "changepermissions");
            return (Criteria) this;
        }

        public Criteria andChangepermissionsLessThanOrEqualTo(Boolean value) {
            addCriterion("changepermissions <=", value, "changepermissions");
            return (Criteria) this;
        }

        public Criteria andChangepermissionsIn(List<Boolean> values) {
            addCriterion("changepermissions in", values, "changepermissions");
            return (Criteria) this;
        }

        public Criteria andChangepermissionsNotIn(List<Boolean> values) {
            addCriterion("changepermissions not in", values, "changepermissions");
            return (Criteria) this;
        }

        public Criteria andChangepermissionsBetween(Boolean value1, Boolean value2) {
            addCriterion("changepermissions between", value1, value2, "changepermissions");
            return (Criteria) this;
        }

        public Criteria andChangepermissionsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("changepermissions not between", value1, value2, "changepermissions");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table permissionsondeployments
     *
     * @mbggenerated do_not_delete_during_merge Sat Apr 05 19:09:46 CEST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
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