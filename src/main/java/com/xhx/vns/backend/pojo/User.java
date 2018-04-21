package com.xhx.vns.backend.pojo;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.ID
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_nickname
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    private String userNickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_wxid
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    private String userWxid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_date
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    private Date userDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_status
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    private Byte userStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_role_id
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    private Byte userRoleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.arg1
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    private String arg1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.arg2
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    private String arg2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.arg3
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    private String arg3;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.ID
     *
     * @return the value of user.ID
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.ID
     *
     * @param id the value for user.ID
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_nickname
     *
     * @return the value of user.user_nickname
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public String getUserNickname() {
        return userNickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_nickname
     *
     * @param userNickname the value for user.user_nickname
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_wxid
     *
     * @return the value of user.user_wxid
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public String getUserWxid() {
        return userWxid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_wxid
     *
     * @param userWxid the value for user.user_wxid
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public void setUserWxid(String userWxid) {
        this.userWxid = userWxid == null ? null : userWxid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_date
     *
     * @return the value of user.user_date
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public Date getUserDate() {
        return userDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_date
     *
     * @param userDate the value for user.user_date
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_status
     *
     * @return the value of user.user_status
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public Byte getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_status
     *
     * @param userStatus the value for user.user_status
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_role_id
     *
     * @return the value of user.user_role_id
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public Byte getUserRoleId() {
        return userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_role_id
     *
     * @param userRoleId the value for user.user_role_id
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public void setUserRoleId(Byte userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.arg1
     *
     * @return the value of user.arg1
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.arg1
     *
     * @param arg1 the value for user.arg1
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public void setArg1(String arg1) {
        this.arg1 = arg1 == null ? null : arg1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.arg2
     *
     * @return the value of user.arg2
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public String getArg2() {
        return arg2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.arg2
     *
     * @param arg2 the value for user.arg2
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public void setArg2(String arg2) {
        this.arg2 = arg2 == null ? null : arg2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.arg3
     *
     * @return the value of user.arg3
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public String getArg3() {
        return arg3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.arg3
     *
     * @param arg3 the value for user.arg3
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    public void setArg3(String arg3) {
        this.arg3 = arg3 == null ? null : arg3.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userNickname='" + userNickname + '\'' +
                ", userWxid='" + userWxid + '\'' +
                ", userDate=" + userDate +
                ", userStatus=" + userStatus +
                ", userRoleId=" + userRoleId +
                ", arg1='" + arg1 + '\'' +
                ", arg2='" + arg2 + '\'' +
                ", arg3='" + arg3 + '\'' +
                '}';
    }
}