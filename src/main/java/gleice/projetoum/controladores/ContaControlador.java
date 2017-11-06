
package gleice.projetoum.controladores;

import gleice.projetoum.modelos.Categoria;
import gleice.projetoum.modelos.Conta;
import gleice.projetoum.modelos.TipoConta;
import gleice.projetoum.repositorios.CategoriaRepositorio;
import gleice.projetoum.repositorios.ContaRepositorio;
import gleice.projetoum.servicos.CategoriaServicos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContaControlador {
    
    @Autowired
    private ContaRepositorio contaRepositorio;

    @Autowired
    private CategoriaServicos categoriaServicos;
    
    @RequestMapping("conta/tela")
    public String telaConta(Model model){
        model.addAttribute("contas",retornaListaDeContas());
        return "telaconta";
    }
    
    private List<Conta> retornaListaDeContas(){
        Iterable<Conta> contas = contaRepositorio.findAll();
        List<Conta> contasFinal = new ArrayList<>();
        contas.forEach(contasFinal::add);
        return contasFinal;
    }
    
    @RequestMapping("conta/tela/cadastrar")
    public String contaCadastro(Model model){
        
        model.addAttribute("categorias", categoriaServicos.retornaListaCategoria());
        model.addAttribute("tipos", TipoConta.values());
        return "cadastroconta";
    }
    
    @RequestMapping(value="conta/cadastrar",method = RequestMethod.POST)
    public String contaCadastrar(Conta conta){
        contaRepositorio.save(conta);
        return "redirect:/conta/tela";
    }
    
}
