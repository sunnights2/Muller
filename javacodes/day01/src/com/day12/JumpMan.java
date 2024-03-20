package com.day12;

public class JumpMan implements Law,Jump{
    @Override
    public void run() {
        System.out.println("跑");
    }

    @Override
    public void law() {
        System.out.println("合法跑步");
    }
}
