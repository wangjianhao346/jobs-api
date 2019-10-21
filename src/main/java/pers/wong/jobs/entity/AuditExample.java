package pers.wong.jobs.entity;

import java.util.ArrayList;
import java.util.List;

public class AuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuditExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andRecruitIdIsNull() {
            addCriterion("recruit_id is null");
            return (Criteria) this;
        }

        public Criteria andRecruitIdIsNotNull() {
            addCriterion("recruit_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitIdEqualTo(Integer value) {
            addCriterion("recruit_id =", value, "recruitId");
            return (Criteria) this;
        }

        public Criteria andRecruitIdNotEqualTo(Integer value) {
            addCriterion("recruit_id <>", value, "recruitId");
            return (Criteria) this;
        }

        public Criteria andRecruitIdGreaterThan(Integer value) {
            addCriterion("recruit_id >", value, "recruitId");
            return (Criteria) this;
        }

        public Criteria andRecruitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruit_id >=", value, "recruitId");
            return (Criteria) this;
        }

        public Criteria andRecruitIdLessThan(Integer value) {
            addCriterion("recruit_id <", value, "recruitId");
            return (Criteria) this;
        }

        public Criteria andRecruitIdLessThanOrEqualTo(Integer value) {
            addCriterion("recruit_id <=", value, "recruitId");
            return (Criteria) this;
        }

        public Criteria andRecruitIdIn(List<Integer> values) {
            addCriterion("recruit_id in", values, "recruitId");
            return (Criteria) this;
        }

        public Criteria andRecruitIdNotIn(List<Integer> values) {
            addCriterion("recruit_id not in", values, "recruitId");
            return (Criteria) this;
        }

        public Criteria andRecruitIdBetween(Integer value1, Integer value2) {
            addCriterion("recruit_id between", value1, value2, "recruitId");
            return (Criteria) this;
        }

        public Criteria andRecruitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recruit_id not between", value1, value2, "recruitId");
            return (Criteria) this;
        }

        public Criteria andIsPassIsNull() {
            addCriterion("is_pass is null");
            return (Criteria) this;
        }

        public Criteria andIsPassIsNotNull() {
            addCriterion("is_pass is not null");
            return (Criteria) this;
        }

        public Criteria andIsPassEqualTo(String value) {
            addCriterion("is_pass =", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotEqualTo(String value) {
            addCriterion("is_pass <>", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassGreaterThan(String value) {
            addCriterion("is_pass >", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassGreaterThanOrEqualTo(String value) {
            addCriterion("is_pass >=", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassLessThan(String value) {
            addCriterion("is_pass <", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassLessThanOrEqualTo(String value) {
            addCriterion("is_pass <=", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassLike(String value) {
            addCriterion("is_pass like", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotLike(String value) {
            addCriterion("is_pass not like", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassIn(List<String> values) {
            addCriterion("is_pass in", values, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotIn(List<String> values) {
            addCriterion("is_pass not in", values, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassBetween(String value1, String value2) {
            addCriterion("is_pass between", value1, value2, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotBetween(String value1, String value2) {
            addCriterion("is_pass not between", value1, value2, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsDisposeIsNull() {
            addCriterion("is_dispose is null");
            return (Criteria) this;
        }

        public Criteria andIsDisposeIsNotNull() {
            addCriterion("is_dispose is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisposeEqualTo(String value) {
            addCriterion("is_dispose =", value, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeNotEqualTo(String value) {
            addCriterion("is_dispose <>", value, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeGreaterThan(String value) {
            addCriterion("is_dispose >", value, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeGreaterThanOrEqualTo(String value) {
            addCriterion("is_dispose >=", value, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeLessThan(String value) {
            addCriterion("is_dispose <", value, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeLessThanOrEqualTo(String value) {
            addCriterion("is_dispose <=", value, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeLike(String value) {
            addCriterion("is_dispose like", value, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeNotLike(String value) {
            addCriterion("is_dispose not like", value, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeIn(List<String> values) {
            addCriterion("is_dispose in", values, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeNotIn(List<String> values) {
            addCriterion("is_dispose not in", values, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeBetween(String value1, String value2) {
            addCriterion("is_dispose between", value1, value2, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsDisposeNotBetween(String value1, String value2) {
            addCriterion("is_dispose not between", value1, value2, "isDispose");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNull() {
            addCriterion("is_read is null");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNotNull() {
            addCriterion("is_read is not null");
            return (Criteria) this;
        }

        public Criteria andIsReadEqualTo(String value) {
            addCriterion("is_read =", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotEqualTo(String value) {
            addCriterion("is_read <>", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThan(String value) {
            addCriterion("is_read >", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThanOrEqualTo(String value) {
            addCriterion("is_read >=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThan(String value) {
            addCriterion("is_read <", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThanOrEqualTo(String value) {
            addCriterion("is_read <=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLike(String value) {
            addCriterion("is_read like", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotLike(String value) {
            addCriterion("is_read not like", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadIn(List<String> values) {
            addCriterion("is_read in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotIn(List<String> values) {
            addCriterion("is_read not in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadBetween(String value1, String value2) {
            addCriterion("is_read between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotBetween(String value1, String value2) {
            addCriterion("is_read not between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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