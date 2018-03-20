package com.github.youyinnn.demo.server;

import com.github.youyinnn.common.packets.GroupMsgRequestBody;
import com.github.youyinnn.server.tcp.AbstractServerAioHandler;
import org.tio.core.ChannelContext;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author youyinnn
 */
public class MyServerAioHandler extends AbstractServerAioHandler {

    private AtomicLong subToken = new AtomicLong();

    @Override
    protected String getToken() {
        return System.currentTimeMillis() + "_" + subToken.incrementAndGet();
    }

    @Override
    protected void beforeHandle(byte msgType) {

    }

    @Override
    protected void afterHandled(byte msgType) {

    }

    @Override
    protected boolean heartbeatRequestHandler(GroupMsgRequestBody baseMsgBody, ChannelContext channelContext) {
        return true;
    }
}
