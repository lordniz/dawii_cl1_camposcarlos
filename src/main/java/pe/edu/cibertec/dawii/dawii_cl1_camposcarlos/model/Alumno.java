package pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import javax.persistence.*;

@Entity
@Table(name = "Alumno")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Alumno {

    @Id
    @Column(name = "IdAlumno")
    private String idAlumno;

    @Column(name = "ApeAlumno")
    private String apeAlumno;

    @Column(name = "NomAlumno")
    private String nomAlumno;

    @ManyToOne
    @JoinColumn(name = "IdEsp")
    private Especialidad especialidad;

    @Column(name = "Proce")
    private String proce;
}
