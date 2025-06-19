package cl.alvaro.camunda.web;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Probar url:
 * curl -X POST http://localhost:8080/api/proceso/iniciar
 */

@RestController
@RequestMapping("/api/proceso")
public class ProcesoController {

    private final RuntimeService runtimeService;

    public ProcesoController(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @PostMapping("/iniciar")
    public ResponseEntity<String> iniciarProceso() {
        runtimeService.startProcessInstanceByKey("hola_mundo");
        return ResponseEntity.ok("✅ Proceso 'hola_mundo' iniciado correctamente.");
    }
}
