package pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.model.request;

import lombok.Getter;
import lombok.Setter;
import pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.model.Especialidad;

@Getter
@Setter
public class AlumnoRequest {
    public String idAlumno;
    public String apeAlumno;
    public String nomAlumno;
    public String proce;
    public String especialidad;
}
