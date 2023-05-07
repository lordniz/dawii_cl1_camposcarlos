package pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.model.Especialidad;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, String> {

}
