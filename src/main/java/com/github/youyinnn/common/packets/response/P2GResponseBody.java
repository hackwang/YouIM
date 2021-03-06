package com.github.youyinnn.common.packets.response;

import com.github.youyinnn.common.packets.BaseBody;

/**
 * @author youyinnn
 */
public class P2GResponseBody extends BaseBody {

    /**
     * 消息内容
     */
    private String msg;

    /**
     * 发送消息者Id
     */
    private String fromUserId;

    /**
     * 发送到哪个组
     */
    private String toGroup;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getToGroup() {
        return toGroup;
    }

    public void setToGroup(String toGroup) {
        this.toGroup = toGroup;
    }

    public P2GResponseBody() {
    }

    public P2GResponseBody(String msg, String fromUserId, String toGroup) {
        this.msg = msg;
        this.fromUserId = fromUserId;
        this.toGroup = toGroup;
    }
}
