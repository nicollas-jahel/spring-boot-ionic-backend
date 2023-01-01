package com.nicollasjahel.cursomc.services;


import org.springframework.mail.SimpleMailMessage;

import com.nicollasjahel.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
