package com.myapplication.task2_oop;

public class MessageConverter {

    public JsonMessage convertXmlToJson(XmlMessage xml) {
        return new JsonMessage(xml.getBody());
    }

    public XmlMessage convertJsonToXml(JsonMessage json) {
        return new XmlMessage(json.getBody());
    }
}