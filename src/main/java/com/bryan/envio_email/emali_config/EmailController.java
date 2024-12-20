package com.bryan.envio_email.emali_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmailController {
	@Autowired
    private EmailService emailService;

    @GetMapping("/enviar-correo")
    public String enviarCorreo() {
        String destinatario = "mancillabryan1996@outlook.com";  // El correo de destino
        String asunto = "Asunto del correo";
        String mensaje = "Este es el cuerpo del correo.";

        emailService.enviarCorreo(destinatario, asunto, mensaje);
        return "Correo enviado con éxito!";
    }
}
