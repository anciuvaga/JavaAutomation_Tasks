package com.myapplication.task3_generics;

public class Main {
    public static void main(String[] args) {

        LeagueTable<UEFA> footballTeams = new LeagueTable<>();
        LeagueTable<NBA> basketballTeams = new LeagueTable<>();

        footballTeams.add(new UEFA("Barcelona"));
        footballTeams.add(new UEFA("Real Madrid"));
        footballTeams.add(new UEFA("Manchester United"));

        basketballTeams.add(new NBA("Chicago Bulls"));
        basketballTeams.add(new NBA("Los Angeles Lakers"));
        basketballTeams.add(new NBA("Boston Celtics"));


        footballTeams.sortList();
        basketballTeams.sortList();



    }

}