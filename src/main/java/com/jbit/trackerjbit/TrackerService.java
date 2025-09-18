package com.jbit.trackerjbit;

import org.springframework.stereotype.Service;

@Service
public class TrackerService {

    private final RedisService redisService;


    public TrackerService(RedisService redisService){
        this.redisService = redisService;
    }

    public String announce(AnnounceRequest request) {
        return redisService.saveAnnounce(request);
    }
}
