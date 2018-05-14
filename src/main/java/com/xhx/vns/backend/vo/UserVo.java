package com.xhx.vns.backend.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xhx.vns.backend.pojo.User;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author XHX
 * @date 2018/4/11.
 */
@Data
public class UserVo {

    private Long id;

    private String userNickname;

    private String userWxid;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date userDate;

    private String userStatus;

    private String userRole;

    public static class UserStatus {

        /**
         * 用户状态-正常
         */
        public static final int USER_STATUS_FORBIDDEN = 1;
        public static final String USER_STATUS_FORBIDDEN_STR = "封禁";
        /**
         * 用户状态-封禁
         */
        public static final int USER_STATUS_NORMAL = 0;
        public static final String USER_STATUS_NORMAL_STR = "正常";
        public static final String USER_STATUS_UNKNOWN_STR = "未知";

        /**
         * 获取用户状态
         *
         * @param n 数字状态
         * @return
         */
        public static String getUserStatus(byte n) {

            switch (n) {
                case USER_STATUS_NORMAL:
                    return USER_STATUS_NORMAL_STR;

                case USER_STATUS_FORBIDDEN:
                    return USER_STATUS_FORBIDDEN_STR;

                default:
                    return USER_STATUS_UNKNOWN_STR;
            }

        }

        /**
         * 获取用户状态
         *
         * @param status
         * @return
         */
        public static Byte getUserStatus(String status) {

            switch (status) {
                case USER_STATUS_NORMAL_STR:
                    return USER_STATUS_NORMAL;

                case USER_STATUS_FORBIDDEN_STR:
                    return USER_STATUS_FORBIDDEN;

                default:
                    return null;
            }

        }
    }

    public UserVo(Long id, String userNickname, String userWxid, Date userDate, String userStatus, String userRole) {
        this.id = id;
        this.userNickname = userNickname;
        this.userWxid = userWxid;
        this.userDate = userDate;
        this.userStatus = userStatus;
        this.userRole = userRole;
    }

    /**
     * 将User 格式化为 UserVo
     *
     * @param user
     * @return
     */
    public static UserVo format(User user) {
        return new UserVo(user.getId(), user.getUserNickname(), user.getUserWxid(), user.getUserDate(),
                UserStatus.getUserStatus(user.getUserStatus()) + "", user.getUserRoleId() + "");
    }

    /**
     * 将User List 格式化为 UserVo List
     *
     * @param users
     * @return
     */
    public static List<UserVo> format(List<User> users) {

        List<UserVo> userVos = new ArrayList<>();
        for (User u : users) {
            userVos.add(format(u));
        }
        return userVos;
    }

    public static User format(UserVo userVo) {

        if (userVo == null) {
            return null;
        }

        User user = new User();
        user.setId(userVo.getId());
        user.setUserNickname(userVo.getUserNickname());
        user.setUserRoleId(Byte.parseByte(userVo.getUserRole()));
        user.setUserStatus(UserStatus.getUserStatus(userVo.getUserStatus()));

        return user;
    }

}
