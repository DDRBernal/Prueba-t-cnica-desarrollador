package entities;

import interfaces.FuenteDatos;

import java.util.Arrays;
import java.util.List;

public class FuenteWeb implements FuenteDatos {

    /**
     * Metodo encargado de retornar documentos
     * @return Lista de objetos "entities.Documento"
     */
    @Override
    public List<Documento> obtenerDocumentos() {
        System.out.println("Obteniendo documentos desde archivo Web...");
        return Arrays.asList(
                new Documento("Documento1", "google.com Web 1", "Web"),
                new Documento("Documento2", "google.com Web 2", "Web")
        );
    }
}