package com.codingshuttle.projects.lovable_clone.entity;

import com.codingshuttle.projects.lovable_clone.enums.MessageRole;

import java.time.Instant;

public class ChatMessage {

    Long id;
    ChatSession chatSession;
    String content;
    String toolCalls; // JSON Array for tools called
    Integer tokensUsed;

    Instant createdAt;
    MessageRole messageRole;
}
