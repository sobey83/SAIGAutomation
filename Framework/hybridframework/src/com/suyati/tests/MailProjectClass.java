package com.suyati.tests;
import java.io.IOException;
import java.util.Properties;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.suyati.frameworkengine.ReadConfig;

public class MailProjectClass {

public static void main(String[] args) throws IOException {

	mailsend();
    
}
public static void  mailsend() throws IOException
{
	
	
	
	final String username = "smathew@suyati.com";
    final String password = "Suyati123";
    
	ReadConfig rc = new ReadConfig();
	
	String MAIL_RECEPIENT = rc.getConfiguration("MAIL_RECEPIENT");

    Properties props = new Properties();
    props.put("mail.smtp.auth", true);
    props.put("mail.smtp.starttls.enable", true);
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

    Session session = Session.getInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

    try {

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("Admin@gmail.com"));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(MAIL_RECEPIENT));
        message.setSubject("Test Result");
        message.setText("Hi here i am");
       
       
        

        MimeBodyPart messageBodyPart = new MimeBodyPart();

        Multipart multipart = new MimeMultipart();

        messageBodyPart = new MimeBodyPart();
      

    
        String file = "./tests/testscenarios.xlsx";
        String fileName = "testscenarios.xlsx";
        DataSource source = new FileDataSource(file);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(fileName);
        multipart.addBodyPart(messageBodyPart);

        message.setContent(multipart);

        System.out.println("Sending");

        Transport.send(message);

        System.out.println("Done");

    } catch (MessagingException e) {
        e.printStackTrace();
    }
  }
}