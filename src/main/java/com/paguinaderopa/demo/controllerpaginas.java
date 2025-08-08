package com.paguinaderopa.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerpaginas {

    @GetMapping("/")
    public String mostrarPaginaPrincipal() {
        return "index"; // Esto busca un archivo index.html en /resources/templates o /static dependiendo de tu configuración
    }

}
