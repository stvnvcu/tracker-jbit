package com.jbit.trackerjbit;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    private final RedisTemplate<String, String> template;

    public RedisService(RedisTemplate<String, String> template){
        this.template = template;
    }

    public String saveAnnounce(AnnounceRequest announceRequest){
        try {
            template.opsForValue().set(announceRequest.getInfoHash(), announceRequest.getPeerId());
            return announceRequest.getInfoHash();
        }catch (Exception e){
            return "error";
        }
    }

}
