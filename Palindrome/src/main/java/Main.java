import entities.*;
import interfaces.FuenteDatos;
import interfaces.Salida;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FuenteDatos> fuentes = List.of(
                new FuenteArchivo(),
                new FuenteWeb(),
                new FuenteExcel()
        );

        List<Documento> todosLosDocumentos = new ArrayList<>();
        for (FuenteDatos fuente : fuentes) {
            todosLosDocumentos.addAll(fuente.obtenerDocumentos());
        }

        Buscador buscador = new Buscador();
        List<Documento> resultadosBusqueda = buscador.buscar(todosLosDocumentos, "ejemplo");

        Salida salidaUI = new SalidaSearchUI();
        Salida salidaDashboard = new SalidaDashboard();

        salidaUI.mostrar(resultadosBusqueda);
        salidaDashboard.mostrar(resultadosBusqueda);
    }
}