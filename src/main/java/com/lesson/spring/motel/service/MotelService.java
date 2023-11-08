package com.lesson.spring.motel.service;

import com.lesson.spring.motel.api.dto.MotelCreateRequest;
import com.lesson.spring.motel.api.dto.MotelResponse;
import com.lesson.spring.motel.dao.MotelDao;
import com.lesson.spring.motel.domain.Motel;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MotelService {

    private final MotelDao motelDao;

    public MotelService(MotelDao motelDao) {
        this.motelDao = motelDao;
    }

    public List<MotelResponse> getMotelList() {
        return motelDao.motelList();
    }

    public void saveMotel(MotelCreateRequest motelCreateRequest) {
        motelDao.saveMotel(motelCreateRequest.getPrice(), motelCreateRequest.getName());
    }
}
