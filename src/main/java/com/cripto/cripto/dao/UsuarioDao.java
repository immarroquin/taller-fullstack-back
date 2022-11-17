package com.cripto.cripto.dao;

import com.cripto.cripto.models.MisMonedas;
import com.cripto.cripto.models.Monedas;
import com.cripto.cripto.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);

    List<Monedas> getMonedas();

    List<MisMonedas> getMisMonedas();

}
