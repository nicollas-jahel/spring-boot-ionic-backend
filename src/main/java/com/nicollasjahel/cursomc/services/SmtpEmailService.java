package com.nicollasjahel.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class SmtpEmailService extends AbstractEmailService{

	@Autowired
	private JavaMailSender mailSender;
	
	private static final Logger LOG = LoggerFactory.getLogger(SmtpEmailService.class);

	@Override
	public void sendEmail(MimeMessage msg) {
		LOG.info("Enviando Email...");
		mailSender.send(msg);
		LOG.info("Email enviado");	
	}

	@Override
	public void sendHtmlEmail(MimeMessage msg) {
		LOG.info("Enviando Email...");
		mailSender.send(msg);
		LOG.info("Email enviado");
		
	}

}
