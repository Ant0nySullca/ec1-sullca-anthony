package pe.edu.idat.ec1_sullca_anthony.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pe.edu.idat.ec1_sullca_anthony.model.EdadModel;
import pe.edu.idat.ec1_sullca_anthony.model.LlamadaModel;


public class EdadController {

    @GetMapping("/edad")
    public String edad(Model model){
        model.addAttribute("mostrar",
                false);
        model.addAttribute("objedad",
                new LlamadaModel());
        return "frmedad";
    }

    @PostMapping("/edad")
    public String procesarFormulario(EdadModel edadModel) {
        int edadMayor = (edadModel.getEdad1());
        int edadMenor = (edadModel.getEdad2());
        int diferencia = edadMayor - edadMenor;

        return "resultado";
    }
}



