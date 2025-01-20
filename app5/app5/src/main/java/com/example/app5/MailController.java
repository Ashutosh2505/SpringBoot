package com.example.app5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.internet.MimeMessage;
@RestController
public class MailController {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@RequestMapping("m1")
	public String testMail() throws Exception{
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
		String bodyContent = "This is the mail body content";
		helper.setText(bodyContent,true);
		helper.setTo("ashukushwaha316@gmail.com");
		helper.setSubject("mail from springboot");
		javaMailSender.send(mimeMessage);
		return "mail sent successfully";
	}
	
	@RequestMapping("m2")
		public String testMail2() throws Exception{
			MimeMessage mimeMessage = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
			String bodyContent = "This is the mail body content</h1>";
			helper.setText(bodyContent,true);
			helper.setTo("ashukushwaha316@gmail.com");
			helper.setSubject("mail from springboot");
			javaMailSender.send(mimeMessage);
			return "mail sent successfully";
				
		
	}

}



