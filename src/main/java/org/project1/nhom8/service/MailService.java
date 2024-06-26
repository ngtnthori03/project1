package org.project1.nhom8.service;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ngtnthori03
 * authentiation email: thinhntph24396@fpt.edu.vn
 * authemtication password: zego gtfb pazk dtwv
 */
public class MailService {

    private Boolean authenticated;
    private String sender;
    private final Properties pro;
    private Session session;
    private boolean result;

    private final String AUTH_USERNAME_KEY = "mail.auth.username";
    private final String AUTH_PASSWORD_KEY = "mail.auth.password";

    public boolean isResult() {
        return this.result;
    }

    public MailService() {
        this.authenticated = false;
        this.pro = new Properties();
        this.result = false;
        this.pro.putAll(new HashMap<String, String>() {
            {
                put("mail.smtp.host", "smtp.gmail.com"); // SMTP Host
                put("mail.smtp.port", "587"); // TLS Port
                put("mail.smtp.auth", "true"); // enable authentication
                put("mail.smtp.starttls.enable", "true"); // enable STARTTLS
            }
        });
    }

    public boolean auth(String _sender, String _password) {
        try {
            this.session = Session.getInstance(pro, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(_sender, _password);
                }
            });

            this.authenticated = true;
        } catch (Exception e) {
            this.authenticated = false;
        }

        return authenticated;
    }

    public Boolean autoAuth() {
        Properties authProps = new Properties();

        InputStream defaultAuthPropsFile = this.getClass()
                .getResourceAsStream("/app.properties");

        try {
            authProps.load(defaultAuthPropsFile);

            return this.auth(authProps.get(AUTH_USERNAME_KEY).toString()
                    , authProps.get(AUTH_PASSWORD_KEY).toString());
        } catch (Exception e) {
            return false;
        }
    }

    public void send(String _receiver, String _subject, String _message) {
        try {
            Message msg = new MimeMessage(session);
            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(_receiver, true));

            msg.setSubject(_subject);

            MimeBodyPart mbp = new MimeBodyPart();
            mbp.setContent(_message, "text/html; charset=utf-8");

            msg.setContent(new MimeMultipart(mbp));

            Transport.send(msg);
            result = true;
        } catch (MessagingException ex) {
            result = false;
            Logger.getLogger(MailService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Boolean getAuthenticated() {
        return authenticated;
    }
}
