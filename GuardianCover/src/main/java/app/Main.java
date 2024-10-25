package app;

import app.config.AppConfig;
import app.config.JPApersistenceConfig;
import app.dto.records.UserDTO;
import app.entity.User;
import app.service.impl.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Create Spring application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the DataSource bean
        UserService dataSource = context.getBean(UserService.class);



    }
}
