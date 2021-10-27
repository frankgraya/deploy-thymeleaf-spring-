/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicando.demo.Controller;

import com.practicando.demo.Views.Vistas;
import java.time.LocalDate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author frank
 */
@Controller
@RequestMapping("/")
public class PersonaController {

    @GetMapping("/")
    public String home(Model model) {
//        model.addAttribute("persona", new Persona("francisco", "granados", "yañez", 29));
        model.addAttribute("fecha", LocalDate.now());
        return Vistas.INDEX;
    }

}
