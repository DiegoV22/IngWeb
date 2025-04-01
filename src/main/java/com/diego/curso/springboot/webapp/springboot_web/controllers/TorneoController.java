package com.diego.curso.springboot.webapp.springboot_web.controllers;

import com.diego.curso.springboot.webapp.springboot_web.models.Torneo;
import com.diego.curso.springboot.webapp.springboot_web.services.TorneoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/torneos")
public class TorneoController {

    @Autowired
    private TorneoService torneoService;

    @GetMapping
    public String listarTorneos(Model model) {
        model.addAttribute("torneos", torneoService.findAll());
        return "torneos/lista"; // Vista que mostraremos luego
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("torneo", new Torneo());
        return "torneos/formulario";
    }

    @PostMapping("/guardar")
    public String guardarTorneo(@ModelAttribute("torneo") Torneo torneo) {
        torneoService.save(torneo);
        return "redirect:/torneos";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicion(@PathVariable Long id, Model model) {
        Torneo torneo = torneoService.findById(id).orElse(null);
        model.addAttribute("torneo", torneo);
        return "torneos/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarTorneo(@PathVariable Long id) {
        torneoService.deleteById(id);
        return "redirect:/torneos";
    }
}