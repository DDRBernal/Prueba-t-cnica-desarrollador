package entities;

import interfaces.Salida;

import java.util.List;

public class SalidaSearchUI implements Salida {
    @Override
    public void mostrar(List<Documento> documentos) {
        System.out.println("Mostrando 5 elementos en la UI de búsqueda:");
        System.out.println("Mostrando resumen de documentos por fuente");
        for (Documento doc : documentos) {
            System.out.println(doc.titulo);
            System.out.println(doc.contenido);
            System.out.println(doc.fuenteOrigen);
        }
    }
}
