package app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("app")
@Import({JPApersistenceConfig.class, WebConfig.class})
public class AppConfig {
}
