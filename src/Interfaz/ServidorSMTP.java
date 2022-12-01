/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author leang
 */
public class ServidorSMTP {
    
    private static String emailFrom = "royalticket11@gmail.com";
    private static String passwordFrom = "wfhggrzdbvudkgsu";
    private String emailTo;
    private String subject;
    private String content;

    private Properties mProperties = new Properties();
    private Session mSession;
    private MimeMessage mCorreo;


    public void createEmail(String cliente, String mensaje, String asunto) {
        emailTo = cliente;
        subject = asunto;
        content = mensaje;
        
         // Simple mail transfer protocol
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user",emailFrom);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");
        
        mSession = Session.getDefaultInstance(mProperties);
        
        
        try {
            mCorreo = new MimeMessage(mSession);
            mCorreo.setFrom(new InternetAddress(emailFrom));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            mCorreo.setSubject(subject);
            mCorreo.setText(content, "ISO-8859-1", "html");
                     
            
        } catch(AddressException ex){
            Logger.getLogger(ServidorSMTP.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (MessagingException ex) {
            Logger.getLogger(ServidorSMTP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sendEmail() {
        try {
            Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(emailFrom, passwordFrom);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
            
            JOptionPane.showMessageDialog(null, "Correo enviado");
        } catch(AddressException ex){
            Logger.getLogger(ServidorSMTP.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (MessagingException ex) {
            Logger.getLogger(ServidorSMTP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
    public void crearConexionSMTP(String cliente, String mensaje, String asunto) throws AddressException{
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");
        
        
        Session sesion = Session.getDefaultInstance(propiedad);
        
        String correoRoyal = "royalticket11@gmail.com";
        String contraseña = "wfhggrzdbvudkgsu";
        
        
        MimeMessage mail = new MimeMessage(sesion);
        
        try {
            mail.setFrom(new InternetAddress(correoRoyal));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(cliente));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoRoyal,contraseña);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
            JOptionPane.showMessageDialog(null, "Correo enviado");
            
        }catch(AddressException ex){
            Logger.getLogger(ServidorSMTP.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (MessagingException ex) {
            Logger.getLogger(ServidorSMTP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }*/
    
}
