package com.mikrotikmanager.mikrotik_manager.service;

import org.springframework.stereotype.Service;

@Service
public class MikrotikService {

    public String consultarStatus() {
        return "Hotspot funcionando";
    }
}