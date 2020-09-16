package student.hackthon.team15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;


@SpringBootApplication(scanBasePackages = "student.hackthon.team15",exclude = {DataSourceAutoConfiguration.class})
public class PersonalFinanceManagerApplication {

	public static void main(String[] args) {

		SpringApplication.run(PersonalFinanceManagerApplication.class, args);

	}

}
