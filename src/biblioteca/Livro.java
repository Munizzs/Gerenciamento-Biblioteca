package biblioteca;
public class Livro {
    public String titulo;
    private String autor;
    private int numeroCopias;

    public Livro(String titulo, String autor, int numeroCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroCopias = numeroCopias;
    }

   

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
    }
    
    
}
