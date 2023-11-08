package com.lesson.spring.motel.dao;

import com.lesson.spring.motel.api.dto.MotelResponse;
import java.util.List;

public interface MotelDao {

    List<MotelResponse> motelList();
    void saveMotel(int price, String name);
}
