package com.lesson.spring.javastudy.abstract1;

public class Sward extends Weapon {

    public Sward(int count) {
        super(5);
        System.out.println("=== 공격 시작 ===");
        System.out.println(count + "번 공격 시작");
        System.out.println("=== 공격 종료 ===");
    }

    @Override
    void attack() {
        System.out.println("검을 휘두른다.");
    }
}
