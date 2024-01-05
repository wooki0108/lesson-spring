package com.lesson.spring.javastudy.quiz.list.num;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Num> numList = new LinkedList<>();
        numList.add(new Num("5", 1));
        numList.add(new Num("8", 1));
        numList.add(new Num("0", 1));
        numList.add(new Num("0", 2));
        numList.add(new Num("1", 2));
        numList.add(new Num("1", 1));
        numList.add(new Num("1", 3));

        Collections.sort(numList,
                Comparator.comparing(Num::getName).thenComparing(Num::getPriority));

        for (Num num : numList) {
            System.out.println(num);
        }


    }

}
