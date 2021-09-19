package com.cursojava.curso.controllers;

import com.cursojava.curso.controllers.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuario(){

        List<Usuario>usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(232L);
        usuario.setNome("Lucas");
        usuario.setApelido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefone("343434343");

        Usuario usuario2 = new Usuario();
        usuario2.setId(242L);
        usuario2.setNome("Maria");
        usuario2.setApelido("Gonzales");
        usuario2.setEmail("mariagonzales@hotmail.com");
        usuario2.setTelefone("3434343432");

        Usuario usuario3 = new Usuario();
        usuario3.setId(52L);
        usuario3.setNome("Rafel");
        usuario3.setApelido("Meneses");
        usuario3.setEmail("rafaelmeneses@hotmail.com");
        usuario3.setTelefone("43334422900");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;

    }

    @RequestMapping(value = "usuario1")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNome("Lucas");
        usuario.setApelido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefone("43334822900");

        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNome("Lucas");
        usuario.setApelido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefone("43334822900");

        return usuario;
    }

    @RequestMapping(value = "usuario4")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNome("Lucas");
        usuario.setApelido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefone("43334822900");

        return usuario;
    }


}
