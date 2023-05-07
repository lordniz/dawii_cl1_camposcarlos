package pe.edu.cibertec.dawii.dawii_cl1_camposcarlos.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResultadoResponse {
    public Boolean respuesta;
    public String mensaje;
}
