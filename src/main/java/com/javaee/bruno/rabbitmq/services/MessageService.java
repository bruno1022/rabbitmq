package com.javaee.bruno.rabbitmq.services;

import com.javaee.bruno.rabbitmq.domain.Message;

public interface MessageService {

	void sendMessage(Message message);
}
