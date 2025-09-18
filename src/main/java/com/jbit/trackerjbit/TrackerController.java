package com.jbit.trackerjbit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackerController {

    private static final Logger LOG = LoggerFactory.getLogger(TrackerController.class);
    private final TrackerService trackerService;

    public TrackerController(TrackerService trackerService){
        this.trackerService = trackerService;
    }


    @GetMapping("/announce")
    public String announce(@ModelAttribute AnnounceRequest request){
        LOG.info("Announcing for request {}",request.getInfoHash());
        return trackerService.announce(request);
    }
}
