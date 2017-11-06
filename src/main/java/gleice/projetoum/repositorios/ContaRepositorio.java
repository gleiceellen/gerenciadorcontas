
package gleice.projetoum.repositorios;

import gleice.projetoum.modelos.Conta;
import org.springframework.data.repository.CrudRepository;

public interface ContaRepositorio  extends CrudRepository<Conta, Long> {
    
}
