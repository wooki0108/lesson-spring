package com.lesson.spring.javastudy.quiz.list.word;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

//        Word word = new Word();

        String[] wordLists = {
                "banana", "apple", "korea", "newjeans", "oak", "spring", "luxury"
        };

        for (int i = 0; i < wordLists.length; i++) {
            Arrays.sort(wordLists,
                    Comparator.comparing(String::length).reversed());
        }

        for (String wordList : wordLists) {
            System.out.println(wordList);
        }


    }

}
