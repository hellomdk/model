package com.hpe.service;

import com.hpe.pojo.Message;

import java.util.List;

public interface MessageService {
    /**
     * 历史聊天记录存储
     * @param message
     * @return
     */
    int insertMessage(Message message);

    /**
     * 历史聊天记录读取
     * @return
     */
    List<Message> historyMessage();
}
