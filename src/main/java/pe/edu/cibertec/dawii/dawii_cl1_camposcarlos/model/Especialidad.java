package pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import javax.persistence.*;

@Entity
@Table(name = "Especialidad")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Especialidad {

    @Id
    @Column(name = "IdEsp")
    private String idEsp;

    @Column(name = "NomEsp")
    private String nomEsp;

    @Column(name = "Costo")
    private Double costo;
}
