
package gleice.projetoum.servicos;

import gleice.projetoum.modelos.Categoria;
import gleice.projetoum.repositorios.CategoriaRepositorio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServicos {
    
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;
    
    public List<Categoria> retornaListaCategoria() {
        Iterable<Categoria> categorias = categoriaRepositorio.findAll();
        List<Categoria> categoriasFinal = new ArrayList<>();
        categorias.forEach(categoriasFinal::add);

        //        for(Categoria c : categorias){
        //            categoriasFinal.add(c);
        //        }
        return categoriasFinal;
    }
}
