package com.example.app.main;

import com.example.service.logic.MessageService;

public class Main {
    public static void main(String[] args) {
//        MessageService messageService = new MessageService();
        System.out.println(MessageService.process("hello intellij modules"));
    }
}
