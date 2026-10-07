package com.mikrotikmanager.mikrotik_manager.service;

import org.springframework.stereotype.Service;

@Service
public class HotspotService {

    private final MikrotikService mikrotikService;

    public HotspotService(MikrotikService mikrotikService) {
        this.mikrotikService = mikrotikService;
    }

    public String consultarStatus() {
        return mikrotikService.consultarStatus();
    }
}