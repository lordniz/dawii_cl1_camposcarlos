package pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.model.Especialidad;
import pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.repository.EspecialidadRepository;

@Service
public class EspecialidadService {

    @Autowired
    private EspecialidadRepository repository;

    public List<Especialidad> getAll() {
        return repository.findAll();
    }

    public Optional<Especialidad> getById(String id) {
        return repository.findById(id);
    }

    public Especialidad save(Especialidad especialidad) {
        return repository.save(especialidad);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

}
