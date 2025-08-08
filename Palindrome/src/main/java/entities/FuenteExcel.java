package entities;

import interfaces.FuenteDatos;

import java.util.Arrays;
import java.util.List;

public class FuenteExcel implements FuenteDatos {

    /**
     * Metodo encargado de retornar documentos
     * @return Lista de objetos "entities.Documento"
     */
    @Override
    public List<Documento> obtenerDocumentos() {
        System.out.println("Obteniendo documentos desde archivo Excel...");
        return Arrays.asList(
                new Documento("Excel 1", "Hoja de calculo Excel 1", "Excel"),
                new Documento("Excel 2", "Hoja de calculo Excel 2", "Excel")
        );
    }
}