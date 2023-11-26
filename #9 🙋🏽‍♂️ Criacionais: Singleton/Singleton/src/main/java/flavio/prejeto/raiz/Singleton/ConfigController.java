package flavio.prejeto.raiz.Singleton;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {
//    @AllArgsConstructor
//    @Autowired não precisa mais
    private Config config;

    public ConfigController(Config config) {
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
