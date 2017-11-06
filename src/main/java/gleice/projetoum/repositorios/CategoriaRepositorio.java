package gleice.projetoum.repositorios;

import gleice.projetoum.modelos.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepositorio extends CrudRepository<Categoria, Long> {
    
}
