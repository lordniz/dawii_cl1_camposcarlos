package pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.model.Alumno;
import pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.repository.AlumnoRepository;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository repository;

    public List<Alumno> getAll() {
        return repository.findAll();
    }

    public Optional<Alumno> getById(String id) {
        return repository.findById(id);
    }

    public Alumno save(Alumno alumno) {
        return repository.save(alumno);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

}
