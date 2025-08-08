package entities;

import java.util.List;

public class Buscador {
    public List<Documento> buscar(List<Documento> documentos, String consulta) {
        System.out.println("Buscando documentos que coincidan con: " + consulta);
        return documentos.subList(0, Math.min(2, documentos.size()));
    }
}
