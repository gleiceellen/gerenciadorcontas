
package gleice.projetoum.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrincipalControlador {
    
    @RequestMapping("/principal")
    public String principal(){
        return "principal";
    }
}
