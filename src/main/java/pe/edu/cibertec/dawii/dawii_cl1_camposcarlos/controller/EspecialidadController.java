package pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.model.Especialidad;
import pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.service.EspecialidadService;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadService;

    @GetMapping
    public ResponseEntity<?> getAllEspecialidades() {
        return ResponseEntity.ok(especialidadService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getEspecialidadById(@PathVariable String id) {
        return especialidadService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?> createEspecialidad(@RequestBody Especialidad especialidad) {
        return ResponseEntity.status(HttpStatus.CREATED).body(especialidadService.save(especialidad));
    }


}
