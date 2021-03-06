package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Lesoes;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesoes")
public class LesoesResource extends GumgaAPI<Lesoes, String> {
    @Autowired
    public LesoesResource(@Qualifier("lesoesService") GumgaService<Lesoes, String> service) {
        super(service);
    }
}
