package com.cripto.cripto.controllers;

import com.cripto.cripto.dao.UsuarioDao;
import com.cripto.cripto.models.Monedas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MonedasController {
    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/monedasback", method = RequestMethod.GET)
    public List<Monedas> getMonedas() {
        return usuarioDao.getMonedas();
    }

}
