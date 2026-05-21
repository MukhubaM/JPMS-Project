package com.example.service.logic;

import com.example.util.helpers.StringHelper;

public class MessageService {
    public static String process(String str) {
        return StringHelper.toUpperCase(str);
    }
}
