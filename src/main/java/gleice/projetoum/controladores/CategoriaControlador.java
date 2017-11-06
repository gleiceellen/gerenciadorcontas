package gleice.projetoum.controladores;

import gleice.projetoum.modelos.Categoria;
import gleice.projetoum.repositorios.CategoriaRepositorio;
import gleice.projetoum.servicos.CategoriaServicos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CategoriaControlador {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;
    
    @Autowired
    private CategoriaServicos categoriaServicos;

    @RequestMapping("categoria/listar")
    @ResponseBody
    public List<Categoria> listaCategorias() {
        return categoriaServicos.retornaListaCategoria();
    }

    

    @RequestMapping("categoria/tela")
    public String telaCategoria(Model model) {
        model.addAttribute("lista", categoriaServicos.retornaListaCategoria());
        return "telacategoria";
    }
    
    
    @RequestMapping("categoria/tela/cadastrar")
    public String telaCadastro() {
        return "cadastrocategoria";
    }
    
    @RequestMapping(value = "categoria/cadastrar", method = RequestMethod.POST)
    public String categoriaCadastrar(Categoria cat) {
        categoriaRepositorio.save(cat);
        return "redirect:/categoria/tela";
    }
}
