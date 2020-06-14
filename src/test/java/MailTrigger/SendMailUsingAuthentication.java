/*
Some SMTP servers require a username and password authentication before you
can use their Server for Sending mail. This is most common with couple
of ISP's who provide SMTP Address to Send Mail.

This Program gives any example on how to do SMTP Authentication
(User and Password verification)

This is a free source code and is provided as it is without any warranties and
it can be used in any your code for free.

Author : Sudhir Ancha
*/
package MailTrigger;

import java.io.File;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.WebDriver;

/*
  To use this program, change values for the following three constants,

    SMTP_HOST_NAME -- Has your SMTP Host Name
    SMTP_AUTH_USER -- Has your SMTP Authentication UserName
    SMTP_AUTH_PWD  -- Has your SMTP Authentication Password

  Next change values for fields

  emailMsgTxt  -- Message Text for the Email
  emailSubjectTxt  -- Subject for email
  emailFromAddress -- Email Address whose name will appears as "from" address

  Next change value for "emailList".
  This String array has List of all Email Addresses to Email Email needs to be sent to.


  Next to run the program, execute it as follows,

  SendMailUsingAuthentication authProg = new SendMailUsingAuthentication();

*/

public class SendMailUsingAuthentication {

	public static final String SMTP_HOST_NAME = "smtp.gmail.com";
	public static final String SMTP_AUTH_USER = "DUMMY@gmail.com";
	public static final String SMTP_AUTH_PWD = "PASSWORD";

	public static final String emailMsgTxt = "Please find attached the latest Mobile Automation Report";
	public static final String emailSubjectTxt = "Mobile Automation Report ";
	public static final String emailFromAddress = "DUMMY@fmail.com";

	// Add List of Email address to who email needs to be sent to
	public static final String emailList = "gudipudisravani@gmail.com,teamautomation2020@gmail.com ";

	public void postMail(String recipients, String subject, String message, String from)
			throws MessagingException {
		boolean debug = false;

		Properties props = new Properties();
		props.setProperty("mail.transport.protocol", "smtp");
		props.setProperty("mail.host", "smtp.gmail.com");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		props.put("mail.debug", "true");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false");

		// Session session = Session.getDefaultInstance(props, null);
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(emailFromAddress, SMTP_AUTH_PWD);
			}
		});

		Message msg = new MimeMessage(session);
		try {
			msg.setFrom(new InternetAddress(from));

			String[] recipientList = emailList.split(",");
			InternetAddress[] recipientAddress = new InternetAddress[recipientList.length];
			int counter = 0;
			for (String recipient : recipientList) {
				recipientAddress[counter] = new InternetAddress(recipient.trim());
				counter++;
			}
			msg.setRecipients(Message.RecipientType.TO, recipientAddress);
			msg.setSubject(subject);

			Multipart multipart = new MimeMultipart();

			MimeBodyPart textBodyPart = new MimeBodyPart();
			textBodyPart.setText(message);

			String filepath = System.getProperty("user.dir") + File.separator + "TestResults.xlsx";
			MimeBodyPart attachmentBodyPart = new MimeBodyPart();
			DataSource source = new FileDataSource(
					System.getProperty("user.dir") + File.separator + "TestResults.xlsx");

			// DataSource source = new FileDataSource("TestResults.xlsx");
			attachmentBodyPart.setDataHandler(new DataHandler(source));
			// System.err.println("Time stamp: "+source + ".zip" );
			// ex : "test.pdf"
			multipart.addBodyPart(textBodyPart); // add the text part
			multipart.addBodyPart(attachmentBodyPart); // add the attachement part
			msg.setContent(multipart);
			Transport.send(msg);
			System.out.println("Mail has been sent");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	/**
	 * SimpleAuthenticator is used to do simple authentication when the SMTP server
	 * requires it.
	 */
	private class SMTPAuthenticator extends javax.mail.Authenticator {

		public PasswordAuthentication getPasswordAuthentication() {
			String username = SMTP_AUTH_USER;
			String password = SMTP_AUTH_PWD;
			return new PasswordAuthentication(username, password);
		}
	}

}
