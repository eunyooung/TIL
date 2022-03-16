package sist.com.mail;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import sist.com.data.input.ReserveVO;

public class MailSender {
    
    public static void main(String[] args) {
        naverMailSend(null, "admin");
    }

    public static void naverMailSend(ReserveVO vo, String id) {
        
        // 오류 참고!!!
        // https://blog.naver.com/PostView.nhn?blogId=ambidext&logNo=222314812690
        
        String host = "smtp.naver.com"; // SMTP 서버 정보를 설정
        String user = "sist_team1@naver.com"; // 네이버 계정
        String password = ""; // 패스워드 
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", 587);
        props.put("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("choi32739@naver.com")); // 메일 수신자
            message.setSubject(id + "님 예약 내역입니다!!", "EUC-KR"); // 메일 제목

            String html = "<div>예약완료</div>"; // 메일 내용

            message.setContent(html, "text/html; charset=EUC-KR"); 
            Transport.send(message);
            System.out.println("Success Message Send");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}