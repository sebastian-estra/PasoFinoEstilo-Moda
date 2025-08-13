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
        return "otros links/envios"; // retorna envios.html
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "otros links/contacto"; // retorna contacto.html
    }

    @GetMapping("/terminos")
    public String terminos() {
        return "otros links/terminos"; // retorna terminos.html
    }

}
