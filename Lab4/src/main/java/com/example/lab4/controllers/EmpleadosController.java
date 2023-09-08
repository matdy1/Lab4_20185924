package com.example.lab4.controllers;

import com.example.lab4.entity.Empleado;
import com.example.lab4.repository.EmpleadoRepositorio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmpleadosController {

    final EmpleadoRepositorio empleadoRepositorio;

    public EmpleadosController(EmpleadoRepositorio empleadoRepositorio) {
        this.empleadoRepositorio = empleadoRepositorio;
    }

    @GetMapping(value="/empleado/lista")
    public String listaJugadores (Model model){

        model.addAttribute("lista", empleadoRepositorio.findAll());
        return "/empleados/lista";
    }

    @PostMapping("/empleado/buscarPorNombre")
    public String buscarPorNombre(@RequestParam("searchField") String searchField, Model model) {

        //List<Shipper> lista =  shipperRepository.findByCompanyName(searchField);
        List<Empleado> lista = empleadoRepositorio.buscarPorNombreCompania(searchField);
        model.addAttribute("lista", lista);
        model.addAttribute("textoBuscado", searchField);

        return "empleados/lista";
    }

}
