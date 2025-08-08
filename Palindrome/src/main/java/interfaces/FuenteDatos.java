package interfaces;

import entities.Documento;

import java.util.List;

public interface FuenteDatos {
    List<Documento> obtenerDocumentos();
}
