package com.lesson.spring.javastudy.quiz.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {

//    Q2. name 호텔이름인경우 합산하여 1개의 객체를 만들어주시면 됩니다. 즉 이름별로 하나의 객체만 생성됨
//    - Hotel(name = “신라”, price = 10000)
//    - Hotel(name = “롯데”, price = 20000)
//    - Hotel(name = “신라”, price = 25000)
//    - Hotel(name = “롯데”, price = 30000)
//    - Hotel(name = “신라”, price = 25000)

//    예시
//    List[Hotel(name = “신라”, price = 60000), Hotel(name = “롯데”, price = 50000)]

    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("신라", 10000);
        Hotel hotel2 = new Hotel("롯데", 20000);
        Hotel hotel3 = new Hotel("신라", 25000);
        Hotel hotel4 = new Hotel("롯데", 30000);
        Hotel hotel5 = new Hotel("신라", 25000);

        List<Hotel> hotels = List.of(hotel1, hotel2, hotel3, hotel4, hotel5);

        Map<String, Integer> hotelMap = new HashMap<>();

        for (Hotel hotel : hotels) {
            if (hotelMap.containsKey(hotel.getName())) {
                int price = hotel.getPrice();
                int totalPrice = price + hotel.getPrice();
                hotelMap.put(hotel.getName(), totalPrice);

            } else {
                hotelMap.put(hotel.getName(), hotel.getPrice());
            }
        }
        // map -> list 변경 해야함
        Set<Entry<String, Integer>> entries = hotelMap.entrySet();

        for (Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }

    }




}
