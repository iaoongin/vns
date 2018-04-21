package com.xhx.vns.backend.vo;

import com.xhx.vns.backend.pojo.User;
import com.xhx.vns.common.util.UserStatus;
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

    private String userNickname;

    private String userWxid;

    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date userDate;

    private String userStatus;

    private String userRole;

    public UserVo(String userNickname, String userWxid, Date userDate, String userStatus, String userRole) {
        this.userNickname = userNickname;
        this.userWxid = userWxid;
        this.userDate = userDate;
        this.userStatus = userStatus;
        this.userRole = userRole;
    }

    /**
     * 将User 格式化为 UserVo
     * @param user
     * @return
     */
    public static UserVo format(User user){
        return new UserVo(user.getUserNickname(),user.getUserWxid() ,user.getUserDate(),
                UserStatus.getUserStatus(user.getUserStatus()) + "", user.getUserRoleId() + "");
    }

    /**
     * 将User List 格式化为 UserVo List
     * @param users
     * @return
     */
    public static List<UserVo> format(List<User> users){

        List<UserVo> userVos = new ArrayList<>();
        for (User u : users) {
            userVos.add(format(u));
        }
        return userVos;
    }


}
