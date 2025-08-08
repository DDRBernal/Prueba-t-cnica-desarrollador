package entities;

import interfaces.FuenteDatos;

import java.util.Arrays;
import java.util.List;

public class FuenteArchivo implements FuenteDatos {

    /**
     * Metodo encargado de retornar documentos
     * @return Lista de objetos "entities.Documento"
     */
    @Override
    public List<Documento> obtenerDocumentos() {
        System.out.println("Obteniendo documentos desde archivo...");
        return Arrays.asList(
                new Documento("Documento1", "Contenido del documento 1", "Archivo X"),
                new Documento("Documento2", "Contenido del documento 2", "Archivo Y")
        );
    }
}
