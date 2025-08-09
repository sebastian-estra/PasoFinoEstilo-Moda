package com.paguinaderopa.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerpaginas {

    @GetMapping("/")
    public String index() {
        return "index"; // Esto busca un archivo index.html en /resources/templates o /static dependiendo de tu configuración
    }

    @GetMapping("/envios")
    public String envios() {
        return "envios"; // retorna envios.html
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto"; // retorna contacto.html
    }

    @GetMapping("/terminos")
    public String terminos() {
        return "terminos"; // retorna terminos.html
    }

}
