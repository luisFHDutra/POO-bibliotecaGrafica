
package negocio;

/**
 *
 * @author luis.dutra
 */
public class Livro {
    private int codigo;
    private String titulo;
    private String autor;

    public Livro() {
        this.codigo++;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
