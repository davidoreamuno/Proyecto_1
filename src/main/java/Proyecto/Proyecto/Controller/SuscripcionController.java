package Proyecto.Proyecto.Controller;

import Proyecto.Proyecto.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.mail.MessagingException;

@Controller
public class SuscripcionController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/suscripcion")
    public String procesarSuscripcion(@RequestParam("email") String email, Model model) throws MessagingException, jakarta.mail.MessagingException {
        emailService.enviarCorreoDeBienvenida(email);
        model.addAttribute("mensaje", "¡Gracias por suscribirte! Revisa tu correo electrónico para más detalles.");
        return "resultado_suscripcion"; 
    }
}
