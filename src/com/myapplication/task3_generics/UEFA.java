package com.myapplication.task3_generics;

import java.util.ArrayList;
import java.util.Collections;

public class UEFA extends Sport {

    UEFA(String teamName) {
        super.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Football{" +
                "teamName='" + teamName + '\'' +
                '}';
    }
}
