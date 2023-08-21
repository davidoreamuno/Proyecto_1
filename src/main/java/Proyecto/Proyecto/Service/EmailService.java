package Proyecto.Proyecto.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void enviarCorreoDeBienvenida(String destinatario) throws MessagingException {
        MimeMessage mensaje = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mensaje, true);
        helper.setTo(destinatario);
        helper.setSubject("¡Bienvenido a nuestro boletín!");
        helper.setText("¡Gracias por suscribirte a nuestro boletín! Estamos emocionados de tenerte como parte de nuestra comunidad.");

        mailSender.send(mensaje);
    }
}
