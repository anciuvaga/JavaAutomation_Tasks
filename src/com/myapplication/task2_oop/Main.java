package com.myapplication.task2_oop;

public class Main {

    public static void main(String[] args) {

        MessageProcessor processor = new MessageProcessor();
        MessageConverter converter = new MessageConverter();
        JsonMessage json = new JsonMessage( "Json");
        XmlMessage xml = new XmlMessage("Xml");

        json.prepareMessage("Hello", "My name is Bill");
        xml.prepareMessage("Hi All");

        processor.proccessJsonMessage(json);
        processor.processXmlMessage(xml);

        System.out.println(converter.convertJsonToXml(json));
        System.out.println(converter.convertXmlToJson(xml));
    }
}