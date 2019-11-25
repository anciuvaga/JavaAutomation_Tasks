package com.myapplication.task2_oop;

public class XmlMessage implements Message {
    private String name = "Xml";
    private String body;

    public XmlMessage(String body) {
        this.body = body;
    }

    @Override
    public String getMessageName() {
        return name;
    }

    @Override
    public void prepareMessage() {
        System.out.println("No text");

    }

    public void prepareMessage(String message) {
        System.out.println("Xml message " +message);

    }

    public void prepareMessage(String message1, String message2) {
        System.out.println("Xml message: " + message1 + " " + "\nXml message: " + message1);

    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "XmlMessage{" +
                "name='" + name + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}