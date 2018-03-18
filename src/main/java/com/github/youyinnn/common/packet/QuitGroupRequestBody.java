package com.github.youyinnn.common.packet;

/**
 * @author youyinnn
 */
public class QuitGroupRequestBody extends BaseBody {

    private String userId;

    private String groupId;

    public QuitGroupRequestBody() {
    }

    public QuitGroupRequestBody(String userId, String groupId) {
        this.userId = userId;
        this.groupId = groupId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}