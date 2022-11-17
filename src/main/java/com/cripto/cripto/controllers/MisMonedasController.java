package com.cripto.cripto.controllers;

import com.cripto.cripto.dao.UsuarioDao;
import com.cripto.cripto.models.MisMonedas;
import com.cripto.cripto.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MisMonedasController {
    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "api/mismonedas", method = RequestMethod.GET)
    public List<MisMonedas> getMisMonedas() {return usuarioDao.getMisMonedas();}

}
