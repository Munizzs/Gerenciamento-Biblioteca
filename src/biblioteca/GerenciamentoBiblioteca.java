package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoBiblioteca {
    private List <Livro> listLivro;

    public GerenciamentoBiblioteca() {
        listLivro = new ArrayList<>();
    }
        
    public void adicionarLivro(Livro livro){
        listLivro.add(livro);
    }
}
