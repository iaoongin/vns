package com.xhx.vns.backend.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
     */
    public CommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
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
     * This method corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCommentArchitectureIdIsNull() {
            addCriterion("comment_architecture_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommentArchitectureIdIsNotNull() {
            addCriterion("comment_architecture_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentArchitectureIdEqualTo(Long value) {
            addCriterion("comment_architecture_ID =", value, "commentArchitectureId");
            return (Criteria) this;
        }

        public Criteria andCommentArchitectureIdNotEqualTo(Long value) {
            addCriterion("comment_architecture_ID <>", value, "commentArchitectureId");
            return (Criteria) this;
        }

        public Criteria andCommentArchitectureIdGreaterThan(Long value) {
            addCriterion("comment_architecture_ID >", value, "commentArchitectureId");
            return (Criteria) this;
        }

        public Criteria andCommentArchitectureIdGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_architecture_ID >=", value, "commentArchitectureId");
            return (Criteria) this;
        }

        public Criteria andCommentArchitectureIdLessThan(Long value) {
            addCriterion("comment_architecture_ID <", value, "commentArchitectureId");
            return (Criteria) this;
        }

        public Criteria andCommentArchitectureIdLessThanOrEqualTo(Long value) {
            addCriterion("comment_architecture_ID <=", value, "commentArchitectureId");
            return (Criteria) this;
        }

        public Criteria andCommentArchitectureIdIn(List<Long> values) {
            addCriterion("comment_architecture_ID in", values, "commentArchitectureId");
            return (Criteria) this;
        }

        public Criteria andCommentArchitectureIdNotIn(List<Long> values) {
            addCriterion("comment_architecture_ID not in", values, "commentArchitectureId");
            return (Criteria) this;
        }

        public Criteria andCommentArchitectureIdBetween(Long value1, Long value2) {
            addCriterion("comment_architecture_ID between", value1, value2, "commentArchitectureId");
            return (Criteria) this;
        }

        public Criteria andCommentArchitectureIdNotBetween(Long value1, Long value2) {
            addCriterion("comment_architecture_ID not between", value1, value2, "commentArchitectureId");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIsNull() {
            addCriterion("comment_author is null");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIsNotNull() {
            addCriterion("comment_author is not null");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEqualTo(Long value) {
            addCriterion("comment_author =", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorNotEqualTo(Long value) {
            addCriterion("comment_author <>", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorGreaterThan(Long value) {
            addCriterion("comment_author >", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_author >=", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorLessThan(Long value) {
            addCriterion("comment_author <", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorLessThanOrEqualTo(Long value) {
            addCriterion("comment_author <=", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIn(List<Long> values) {
            addCriterion("comment_author in", values, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorNotIn(List<Long> values) {
            addCriterion("comment_author not in", values, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorBetween(Long value1, Long value2) {
            addCriterion("comment_author between", value1, value2, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorNotBetween(Long value1, Long value2) {
            addCriterion("comment_author not between", value1, value2, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIsNull() {
            addCriterion("comment_target is null");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIsNotNull() {
            addCriterion("comment_target is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTargetEqualTo(Long value) {
            addCriterion("comment_target =", value, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetNotEqualTo(Long value) {
            addCriterion("comment_target <>", value, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetGreaterThan(Long value) {
            addCriterion("comment_target >", value, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_target >=", value, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetLessThan(Long value) {
            addCriterion("comment_target <", value, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetLessThanOrEqualTo(Long value) {
            addCriterion("comment_target <=", value, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIn(List<Long> values) {
            addCriterion("comment_target in", values, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetNotIn(List<Long> values) {
            addCriterion("comment_target not in", values, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetBetween(Long value1, Long value2) {
            addCriterion("comment_target between", value1, value2, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentTargetNotBetween(Long value1, Long value2) {
            addCriterion("comment_target not between", value1, value2, "commentTarget");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNull() {
            addCriterion("comment_date is null");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNotNull() {
            addCriterion("comment_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDateEqualTo(Date value) {
            addCriterion("comment_date =", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotEqualTo(Date value) {
            addCriterion("comment_date <>", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThan(Date value) {
            addCriterion("comment_date >", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_date >=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThan(Date value) {
            addCriterion("comment_date <", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThanOrEqualTo(Date value) {
            addCriterion("comment_date <=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateIn(List<Date> values) {
            addCriterion("comment_date in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotIn(List<Date> values) {
            addCriterion("comment_date not in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateBetween(Date value1, Date value2) {
            addCriterion("comment_date between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotBetween(Date value1, Date value2) {
            addCriterion("comment_date not between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGmtIsNull() {
            addCriterion("comment_date_gmt is null");
            return (Criteria) this;
        }

        public Criteria andCommentDateGmtIsNotNull() {
            addCriterion("comment_date_gmt is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDateGmtEqualTo(Date value) {
            addCriterion("comment_date_gmt =", value, "commentDateGmt");
            return (Criteria) this;
        }

        public Criteria andCommentDateGmtNotEqualTo(Date value) {
            addCriterion("comment_date_gmt <>", value, "commentDateGmt");
            return (Criteria) this;
        }

        public Criteria andCommentDateGmtGreaterThan(Date value) {
            addCriterion("comment_date_gmt >", value, "commentDateGmt");
            return (Criteria) this;
        }

        public Criteria andCommentDateGmtGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_date_gmt >=", value, "commentDateGmt");
            return (Criteria) this;
        }

        public Criteria andCommentDateGmtLessThan(Date value) {
            addCriterion("comment_date_gmt <", value, "commentDateGmt");
            return (Criteria) this;
        }

        public Criteria andCommentDateGmtLessThanOrEqualTo(Date value) {
            addCriterion("comment_date_gmt <=", value, "commentDateGmt");
            return (Criteria) this;
        }

        public Criteria andCommentDateGmtIn(List<Date> values) {
            addCriterion("comment_date_gmt in", values, "commentDateGmt");
            return (Criteria) this;
        }

        public Criteria andCommentDateGmtNotIn(List<Date> values) {
            addCriterion("comment_date_gmt not in", values, "commentDateGmt");
            return (Criteria) this;
        }

        public Criteria andCommentDateGmtBetween(Date value1, Date value2) {
            addCriterion("comment_date_gmt between", value1, value2, "commentDateGmt");
            return (Criteria) this;
        }

        public Criteria andCommentDateGmtNotBetween(Date value1, Date value2) {
            addCriterion("comment_date_gmt not between", value1, value2, "commentDateGmt");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("comment_content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("comment_content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("comment_content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("comment_content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("comment_content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("comment_content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("comment_content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("comment_content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("comment_content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("comment_content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("comment_content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("comment_content not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNull() {
            addCriterion("comment_status is null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNotNull() {
            addCriterion("comment_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusEqualTo(Byte value) {
            addCriterion("comment_status =", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotEqualTo(Byte value) {
            addCriterion("comment_status <>", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThan(Byte value) {
            addCriterion("comment_status >", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("comment_status >=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThan(Byte value) {
            addCriterion("comment_status <", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThanOrEqualTo(Byte value) {
            addCriterion("comment_status <=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIn(List<Byte> values) {
            addCriterion("comment_status in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotIn(List<Byte> values) {
            addCriterion("comment_status not in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusBetween(Byte value1, Byte value2) {
            addCriterion("comment_status between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("comment_status not between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentLikenumIsNull() {
            addCriterion("comment_likenum is null");
            return (Criteria) this;
        }

        public Criteria andCommentLikenumIsNotNull() {
            addCriterion("comment_likenum is not null");
            return (Criteria) this;
        }

        public Criteria andCommentLikenumEqualTo(Integer value) {
            addCriterion("comment_likenum =", value, "commentLikenum");
            return (Criteria) this;
        }

        public Criteria andCommentLikenumNotEqualTo(Integer value) {
            addCriterion("comment_likenum <>", value, "commentLikenum");
            return (Criteria) this;
        }

        public Criteria andCommentLikenumGreaterThan(Integer value) {
            addCriterion("comment_likenum >", value, "commentLikenum");
            return (Criteria) this;
        }

        public Criteria andCommentLikenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_likenum >=", value, "commentLikenum");
            return (Criteria) this;
        }

        public Criteria andCommentLikenumLessThan(Integer value) {
            addCriterion("comment_likenum <", value, "commentLikenum");
            return (Criteria) this;
        }

        public Criteria andCommentLikenumLessThanOrEqualTo(Integer value) {
            addCriterion("comment_likenum <=", value, "commentLikenum");
            return (Criteria) this;
        }

        public Criteria andCommentLikenumIn(List<Integer> values) {
            addCriterion("comment_likenum in", values, "commentLikenum");
            return (Criteria) this;
        }

        public Criteria andCommentLikenumNotIn(List<Integer> values) {
            addCriterion("comment_likenum not in", values, "commentLikenum");
            return (Criteria) this;
        }

        public Criteria andCommentLikenumBetween(Integer value1, Integer value2) {
            addCriterion("comment_likenum between", value1, value2, "commentLikenum");
            return (Criteria) this;
        }

        public Criteria andCommentLikenumNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_likenum not between", value1, value2, "commentLikenum");
            return (Criteria) this;
        }

        public Criteria andCommentParentIsNull() {
            addCriterion("comment_parent is null");
            return (Criteria) this;
        }

        public Criteria andCommentParentIsNotNull() {
            addCriterion("comment_parent is not null");
            return (Criteria) this;
        }

        public Criteria andCommentParentEqualTo(Long value) {
            addCriterion("comment_parent =", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentNotEqualTo(Long value) {
            addCriterion("comment_parent <>", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentGreaterThan(Long value) {
            addCriterion("comment_parent >", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_parent >=", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentLessThan(Long value) {
            addCriterion("comment_parent <", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentLessThanOrEqualTo(Long value) {
            addCriterion("comment_parent <=", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentIn(List<Long> values) {
            addCriterion("comment_parent in", values, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentNotIn(List<Long> values) {
            addCriterion("comment_parent not in", values, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentBetween(Long value1, Long value2) {
            addCriterion("comment_parent between", value1, value2, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentNotBetween(Long value1, Long value2) {
            addCriterion("comment_parent not between", value1, value2, "commentParent");
            return (Criteria) this;
        }

        public Criteria andArg1IsNull() {
            addCriterion("arg1 is null");
            return (Criteria) this;
        }

        public Criteria andArg1IsNotNull() {
            addCriterion("arg1 is not null");
            return (Criteria) this;
        }

        public Criteria andArg1EqualTo(String value) {
            addCriterion("arg1 =", value, "arg1");
            return (Criteria) this;
        }

        public Criteria andArg1NotEqualTo(String value) {
            addCriterion("arg1 <>", value, "arg1");
            return (Criteria) this;
        }

        public Criteria andArg1GreaterThan(String value) {
            addCriterion("arg1 >", value, "arg1");
            return (Criteria) this;
        }

        public Criteria andArg1GreaterThanOrEqualTo(String value) {
            addCriterion("arg1 >=", value, "arg1");
            return (Criteria) this;
        }

        public Criteria andArg1LessThan(String value) {
            addCriterion("arg1 <", value, "arg1");
            return (Criteria) this;
        }

        public Criteria andArg1LessThanOrEqualTo(String value) {
            addCriterion("arg1 <=", value, "arg1");
            return (Criteria) this;
        }

        public Criteria andArg1Like(String value) {
            addCriterion("arg1 like", value, "arg1");
            return (Criteria) this;
        }

        public Criteria andArg1NotLike(String value) {
            addCriterion("arg1 not like", value, "arg1");
            return (Criteria) this;
        }

        public Criteria andArg1In(List<String> values) {
            addCriterion("arg1 in", values, "arg1");
            return (Criteria) this;
        }

        public Criteria andArg1NotIn(List<String> values) {
            addCriterion("arg1 not in", values, "arg1");
            return (Criteria) this;
        }

        public Criteria andArg1Between(String value1, String value2) {
            addCriterion("arg1 between", value1, value2, "arg1");
            return (Criteria) this;
        }

        public Criteria andArg1NotBetween(String value1, String value2) {
            addCriterion("arg1 not between", value1, value2, "arg1");
            return (Criteria) this;
        }

        public Criteria andArg2IsNull() {
            addCriterion("arg2 is null");
            return (Criteria) this;
        }

        public Criteria andArg2IsNotNull() {
            addCriterion("arg2 is not null");
            return (Criteria) this;
        }

        public Criteria andArg2EqualTo(String value) {
            addCriterion("arg2 =", value, "arg2");
            return (Criteria) this;
        }

        public Criteria andArg2NotEqualTo(String value) {
            addCriterion("arg2 <>", value, "arg2");
            return (Criteria) this;
        }

        public Criteria andArg2GreaterThan(String value) {
            addCriterion("arg2 >", value, "arg2");
            return (Criteria) this;
        }

        public Criteria andArg2GreaterThanOrEqualTo(String value) {
            addCriterion("arg2 >=", value, "arg2");
            return (Criteria) this;
        }

        public Criteria andArg2LessThan(String value) {
            addCriterion("arg2 <", value, "arg2");
            return (Criteria) this;
        }

        public Criteria andArg2LessThanOrEqualTo(String value) {
            addCriterion("arg2 <=", value, "arg2");
            return (Criteria) this;
        }

        public Criteria andArg2Like(String value) {
            addCriterion("arg2 like", value, "arg2");
            return (Criteria) this;
        }

        public Criteria andArg2NotLike(String value) {
            addCriterion("arg2 not like", value, "arg2");
            return (Criteria) this;
        }

        public Criteria andArg2In(List<String> values) {
            addCriterion("arg2 in", values, "arg2");
            return (Criteria) this;
        }

        public Criteria andArg2NotIn(List<String> values) {
            addCriterion("arg2 not in", values, "arg2");
            return (Criteria) this;
        }

        public Criteria andArg2Between(String value1, String value2) {
            addCriterion("arg2 between", value1, value2, "arg2");
            return (Criteria) this;
        }

        public Criteria andArg2NotBetween(String value1, String value2) {
            addCriterion("arg2 not between", value1, value2, "arg2");
            return (Criteria) this;
        }

        public Criteria andArg3IsNull() {
            addCriterion("arg3 is null");
            return (Criteria) this;
        }

        public Criteria andArg3IsNotNull() {
            addCriterion("arg3 is not null");
            return (Criteria) this;
        }

        public Criteria andArg3EqualTo(String value) {
            addCriterion("arg3 =", value, "arg3");
            return (Criteria) this;
        }

        public Criteria andArg3NotEqualTo(String value) {
            addCriterion("arg3 <>", value, "arg3");
            return (Criteria) this;
        }

        public Criteria andArg3GreaterThan(String value) {
            addCriterion("arg3 >", value, "arg3");
            return (Criteria) this;
        }

        public Criteria andArg3GreaterThanOrEqualTo(String value) {
            addCriterion("arg3 >=", value, "arg3");
            return (Criteria) this;
        }

        public Criteria andArg3LessThan(String value) {
            addCriterion("arg3 <", value, "arg3");
            return (Criteria) this;
        }

        public Criteria andArg3LessThanOrEqualTo(String value) {
            addCriterion("arg3 <=", value, "arg3");
            return (Criteria) this;
        }

        public Criteria andArg3Like(String value) {
            addCriterion("arg3 like", value, "arg3");
            return (Criteria) this;
        }

        public Criteria andArg3NotLike(String value) {
            addCriterion("arg3 not like", value, "arg3");
            return (Criteria) this;
        }

        public Criteria andArg3In(List<String> values) {
            addCriterion("arg3 in", values, "arg3");
            return (Criteria) this;
        }

        public Criteria andArg3NotIn(List<String> values) {
            addCriterion("arg3 not in", values, "arg3");
            return (Criteria) this;
        }

        public Criteria andArg3Between(String value1, String value2) {
            addCriterion("arg3 between", value1, value2, "arg3");
            return (Criteria) this;
        }

        public Criteria andArg3NotBetween(String value1, String value2) {
            addCriterion("arg3 not between", value1, value2, "arg3");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table comment
     *
     * @mbggenerated do_not_delete_during_merge Wed May 09 11:13:09 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table comment
     *
     * @mbggenerated Wed May 09 11:13:09 CST 2018
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