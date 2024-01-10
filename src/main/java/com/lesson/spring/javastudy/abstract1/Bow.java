package com.lesson.spring.javastudy.abstract1;

public class Bow extends Weapon {

    public Bow(int count) {
        super(count);
        System.out.println("=== 공격 시작 ===");
        System.out.println(count + "번 공격 시작");
        System.out.println("=== 공격 종료 ===");
    }

    @Override
    void attack() {
        System.out.println("활을 쏜다.");

    }
}
