package com.day12;

public class Pingpong implements SportMan{
    @Override
    public void run() {
        System.out.println("跑得快");
    }

    @Override
    public void law() {
        System.out.println("遵纪守法");
    }

    @Override
    public String compete(String project) {
        return "参加"+project+"获得冠军";
    }
}
