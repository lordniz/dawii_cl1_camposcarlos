package pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.model.Alumno;
import pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.model.Especialidad;
import pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.model.request.AlumnoRequest;
import pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.model.response.ResultadoResponse;
import pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.service.AlumnoService;

@Controller
@RequestMapping("/")
public class AlumnoController {

    @Autowired
    private AlumnoService service;

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("alumnos", service.getAll());
        return "index";
    }



    @PostMapping("/guardar")
    public Alumno guardar(@RequestBody Alumno alumno) {
        return service.save(alumno);
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable String id) {
        service.deleteById(id);
        return "redirect:/listar";
    }
}
