package spring.boot.gamejavabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Locale;

@SpringBootApplication
public class GameJavaBaseApplication {
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource
				= new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:replicas");
		return messageSource;
	}

	@Autowired
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GameJavaBaseApplication.class, args);
//		Locale locale = Locale.getDefault();
		Locale locale = Locale.US;
		GameExe game = context.getBean(GameExe.class);
		game.launch(locale);
	}
}
