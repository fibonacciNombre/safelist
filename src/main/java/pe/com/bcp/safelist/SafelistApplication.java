package pe.com.bcp.safelist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pe.com.bcp.safelist")
public class SafelistApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafelistApplication.class, args);
	}
}
