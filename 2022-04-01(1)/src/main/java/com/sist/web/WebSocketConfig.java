package com.sist.web;

import org.springframework.context.annotation.*;
import org.springframework.web.socket.config.annotation.*;


@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // TODO Auto-generated method stub
        registry.addHandler(chatHandler(), "/chat/chat-ws");
    }

    @Bean
    public WebSocketChatHandler chatHandler() {
        System.out.println("Server start...");
        return new WebSocketChatHandler();
    }
}