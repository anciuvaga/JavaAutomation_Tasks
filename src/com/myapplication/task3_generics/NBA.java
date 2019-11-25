package com.myapplication.task3_generics;

public class NBA extends Sport {

    NBA(String teamName) {
        super.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Basketball{" +
                "teamName='" + teamName + '\'' +
                '}';
    }
}