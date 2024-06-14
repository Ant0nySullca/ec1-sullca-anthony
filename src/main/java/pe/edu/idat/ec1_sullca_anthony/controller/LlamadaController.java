package pe.edu.idat.ec1_sullca_anthony.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pe.edu.idat.ec1_sullca_anthony.model.EdadModel;
import pe.edu.idat.ec1_sullca_anthony.model.LlamadaModel;

@Controller
public class LlamadaController {
    @GetMapping("/llamada")
    public String llamada(Model model){
        model.addAttribute("mostrar",
                false);
        model.addAttribute("objllamada",
                new LlamadaModel());
        return "frmllamada";
    }

    @PostMapping("/llamada")
    public String calcularllamada(LlamadaModel llamadaModel,
                                  Model model){
        Integer valorMinutos= llamadaModel.getMinutos();
        Double costoTotal = 0.0;

            if (valorMinutos <= 5) {
                costoTotal = 10.0;
            } else {
                costoTotal = 10 + (valorMinutos - 5.0) * 2;
            }
        model.addAttribute("EL COSTO TOTAL ES "+costoTotal);
        model.addAttribute("mostrar",
                true);
        model.addAttribute("objllamada",
                new LlamadaModel());
        return "frmllamada";
        }
















    }

