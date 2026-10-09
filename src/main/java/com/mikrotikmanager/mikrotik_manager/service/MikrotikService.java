package com.mikrotikmanager.mikrotik_manager.service;

import me.legrange.mikrotik.ApiConnection;
import org.springframework.stereotype.Service;

@Service
public class MikrotikService {

    private final String host = "192.168.88.1";
    private final String usuario = "admin";
    private final String senha = "";

    public String consultarStatus() {

        try {
            ApiConnection con = ApiConnection.connect(host);

            con.login(usuario, senha);

            con.close();

            return "Conexão com o MikroTik realizada com sucesso!";

        } catch (Exception e) {
            return "Erro ao conectar com o MikroTik: " + e.getMessage();
        }
    }
}