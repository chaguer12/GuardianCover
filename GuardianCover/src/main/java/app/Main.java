package app;

import app.config.JPApersistenceConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Create Spring application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JPApersistenceConfig.class);

        // Get the DataSource bean
        DataSource dataSource = context.getBean(DataSource.class);

        // Test the connection
        try (Connection connection = dataSource.getConnection()) {
            if (connection != null && !connection.isClosed()) {
                System.out.println("Connection successful!");
            } else {
                System.out.println("Failed to establish connection.");
            }
        } catch (SQLException e) {
            System.out.println("SQLException occurred: " + e.getMessage());
        }

        // Close the Spring context
        context.close();
    }
}
