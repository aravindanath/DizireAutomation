package MailTrigger;

// Java program to send email

import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport;


public class SendEmail
{
    SendMailUsingAuthentication email = new SendMailUsingAuthentication();
    @BeforeSuite
    public void sute1(){
        System.out.println("=========== Before suite ============");
    }

   @Test
    public void demo(){
       System.out.println("Demo");

    }

    @AfterSuite
    public void Aftersute1() throws MessagingException {
        System.out.println("=========== After suite ============");
        email.postMail("gudipudisravani@gmail.com","Hello Test email","This is email from automation team","reports.mobileautomation.wibmo@gmail.com");
    }

}
