package com.myapplication.task2_oop;

import sun.plugin2.message.Message;

public class MessageProcessor {

    public void processXmlMessage(XmlMessage xml) {
        System.out.println("Name: " + xml.getName() + "\nBody: " + xml.getBody());
    }

    public void proccessJsonMessage(JsonMessage json) {
        System.out.println("Name: " + json.getName() + "\nBody: " + json.getBody());
    }
}
