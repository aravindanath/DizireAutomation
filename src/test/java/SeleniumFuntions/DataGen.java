package SeleniumFuntions;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import utilits.BasePage;

import java.util.Locale;

public class DataGen {

    @Test
    public void data(){

        //https://github.com/DiUS/java-faker

        Faker fk = new Faker(new Locale("en-IND"));
        String fn = fk.name().fullName();
        System.out.println(fn);
        String email = BasePage.generateEmail();
        System.out.println(email);
        System.out.println(BasePage.generateMobile());

    }
}
