package com.myapplication.task2_oop;

public class JsonMessage implements Message {
    private String name = "Json";
    private String body;

    public JsonMessage(String body) {
        this.body = body;
    }

    @Override
    public String getMessageName() {
        return name;
    }

    @Override
    public void prepareMessage() {
        System.out.println("No text json ");
    }

    public void prepareMessage(String message) {
        System.out.println("Json message " + message);

    }
    public void prepareMessage(String message1, String message2) {
        System.out.println("Json message: " + message1 + " " + "\nJson message: " + message2);

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

    @Override
    public String toString() {
        return "JsonMessage{" +
                "name='" + name + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}