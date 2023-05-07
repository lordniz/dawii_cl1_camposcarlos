package pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, String> {
}
