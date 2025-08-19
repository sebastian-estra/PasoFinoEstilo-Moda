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
        return "otros_links/envios"; // retorna envios.html
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "otros_links/contacto"; // retorna contacto.html
    }

    @GetMapping("/terminos")
    public String terminos() {
        return "otros_links/terminos"; // retorna terminos.html
    }

    @GetMapping("/politicas-privacidad")
    public String politicasPrivacidad() {
        return "otros_links/politicas-privacidad"; // retorna políticas-privacidad.html
    }

    @GetMapping("/politica-datos")
    public String politicaDatos() {
        return "otros_links/politica-datos"; // retorna politica-datos.html
    }

    @GetMapping("/comentarios")
    public String comentarios() {
        return "otros_links/comentarios"; // retorna comentarios.html
    }

    @GetMapping("/folleto")
    public String folleto() {
        return "otros_links/folleto"; // retorna folleto.html
    }

    @GetMapping("/pqr")
    public String pqr() {
        return "otros_links/pqr"; // retorna pqr.html
    }

    @GetMapping("/noticias")
    public String noticias() {
        return "otros_links/noticias"; // retorna noticias.html
    }

    @GetMapping("/carrito")
    public String carrito() {
        return "carrito/carrito"; // retorna carrito.html
    }

    @GetMapping("/loguin")
    public String loguin() {
        return "loguin/loguin"; // retorna loguin.html
    }

    @GetMapping("/crud")
    public String crud() {
        return "crud/crud"; // retorna crud.html
    }

    @GetMapping("/categorias")
    public String categorias() {
        return "crud/categorias"; // retorna categorias.html
    }

    @GetMapping("/lista")
    public String lista() {
        return "crud/lista"; // retorna lista.html
    }

}
