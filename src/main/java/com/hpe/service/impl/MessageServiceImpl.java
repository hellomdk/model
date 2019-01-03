package com.hpe.service.impl;

import com.hpe.Mapper.MessageMapper;
import com.hpe.pojo.Message;
import com.hpe.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;

    @Override
    public int insertMessage(Message message) {
        int insert = messageMapper.insert(message);
        return insert;
    }

    @Override
    public List<Message> historyMessage() {
        messageMapper.select(null);
        return null;
    }
}
