package entities;

public class Documento {

    public String titulo;
    public String contenido;
    public String fuenteOrigen;

    public Documento(String titulo, String contenido, String fuenteOrigen) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fuenteOrigen = fuenteOrigen;
    }
}
