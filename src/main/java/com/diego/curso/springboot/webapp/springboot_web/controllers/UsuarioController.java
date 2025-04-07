package com.diego.curso.springboot.webapp.springboot_web.controllers;

import com.diego.curso.springboot.webapp.springboot_web.models.Usuario;
import com.diego.curso.springboot.webapp.springboot_web.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioService.findAll());
        return "usuarios/lista";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuarios/formulario";
    }

    @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario, Model model) {
    
        String password = usuario.getPassword();
        
        // Validar contraseña segura
        // if (password == null || password.length() < 8 ||
        // !password.matches(".*[A-Z].*") ||
        // !password.matches(".*[a-z].*") ||
        // !password.matches(".*\\d.*")||
        // !password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{}|;:',.<>/?].*")) 
        // {
        
        //     model.addAttribute("usuario", usuario);
        //     model.addAttribute("error", "La contraseña debe tener al menos 8 caracteres, una mayúscula, una minúscula, un número y un símbolo.");
        //     return "usuarios/formulario";
        // }

    
    
        // Encriptar contraseña antes de guardar
       // usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        usuario.setFechaRegistro(LocalDate.now());
    
        usuarioService.save(usuario);
        return "redirect:/usuarios";
    }
    

    

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        Usuario usuario = usuarioService.findById(id).orElse(null);
        model.addAttribute("usuario", usuario);
        return "usuarios/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarUsuario(@PathVariable Long id) {
        usuarioService.deleteById(id);
        return "redirect:/usuarios";
    }
}