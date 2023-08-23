package Proyecto.Proyecto.Controller;

import Proyecto.Proyecto.Service.UsuarioService;
import Proyecto.Proyecto.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario usuario) {
        // Implementa la lógica de inicio de sesión utilizando usuarioService
        // ...
        return ResponseEntity.ok("Inicio de sesión exitoso.");
    }

    @PostMapping("/registro")
    public ResponseEntity<String> registro(@RequestBody Usuario usuario) {
        // Implementa la lógica de registro utilizando usuarioService
        // ...
        return ResponseEntity.ok("Registro exitoso.");
    }
}


