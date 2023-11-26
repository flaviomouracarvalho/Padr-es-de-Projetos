package flavio.prejeto.raiz.Singleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/relatorio")
public class RelatorioController {
//    @AllArgsConstructor
//    @Autowired não precisa mais
    private Config config;

    public RelatorioController(Config config) {
        this.config = config;
    }

    @GetMapping
    public Config getConfig(){
        return config;
    }

    @GetMapping("/update")
    public Config updateCocnfig(){
        config.setTipoGraficos("Pizza");
        return config;
    }
}
