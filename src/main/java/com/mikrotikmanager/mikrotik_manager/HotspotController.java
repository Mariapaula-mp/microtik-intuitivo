package com.mikrotikmanager.mikrotik_manager.controller;

import com.mikrotikmanager.mikrotik_manager.service.HotspotService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hotspot")
public class HotspotController {

    private final HotspotService hotspotService;

    public HotspotController(HotspotService hotspotService) {
        this.hotspotService = hotspotService;
    }

    @GetMapping("/status")
    public String status() {
        return hotspotService.consultarStatus();
    }
}