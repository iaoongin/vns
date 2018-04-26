package com.xhx.vns.common.util;

/**
 * @author XHX
 * @date 2018/4/12.
 */
public class UserStatus {

    /**用户状态-正常 */
    public static final int USER_STATUS_FORBIDDEN = 1;
    /**用户状态-封禁 */
    public static final int USER_STATUS_NORMAL = 0;

    /**
     * 获取用户状态
     *
     * @param n 数字状态
     * @return
     */
    public static String getUserStatus(byte n) {

        switch (n) {
            case USER_STATUS_NORMAL:
                return "正常";

            case USER_STATUS_FORBIDDEN:
                return "封禁";

            default:
                return "未知";
        }

    }
}
