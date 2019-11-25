package com.myapplication.task3_generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeagueTable<T extends Sport> {

    List<T> teamList = new ArrayList<>();

    public void add(T teamName) {
        teamList.add(teamName);
    }

    public void sortList() {
        teamList.sort(Comparator.comparing(T::getTeamName));
        for (T team : teamList) {
            System.out.println("LeagueTab TEAM LIST: " + team);
        }
    }


}