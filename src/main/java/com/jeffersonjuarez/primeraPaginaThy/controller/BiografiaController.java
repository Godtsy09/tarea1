package com.jeffersonjuarez.primeraPaginaThy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BiografiaController {

    @GetMapping("/biografia")
    public String mostrarAutobiografia (Model model){
        model.addAttribute("Nombre","Jefferson Geovanny");
        model.addAttribute("Apellido","Juárez Ruano");
        model.addAttribute("Edad",16);
        model.addAttribute("Infancia","Naci en la ciudad de guatemala y vivi la mayoria de mi vida" +
                " en z24, creci en una familia de 4: padre, madre y hermana. Desde pequeño creci jugando videojuegos y mi papa " +
                "trabajaba en I.T lo q hizo q siempre me llamara la atencion la tecnologia/computadoras.");
        model.addAttribute("Actualidad","Soy un Estudiante de kinal de 5to perito en informatica." +
                " El año siguiente año sera mi ultimo año de carrera, sigo viviendo en z24 :(, me gusta mucho escuchar musica " +
                " desde que despierto, me gusta ver peliculas y jugar videojuegos en mis tiempos libres, y estoy a menos de un " +
                " mes de cumplir 17 años");
        return "biografia";
    }
}
