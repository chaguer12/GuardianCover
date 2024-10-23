package app.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import jakarta.annotation.sql.DataSourceDefinition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;

import javax.sql.DataSource;

@Configuration
public class JPAconfig {
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    @Value("${spring.datasource.hikari.connection-timeout}")
    private long connectionTimeout;

    @Value("${spring.datasource.hikari.maximum-pool-size}")
    private int maxPoolSize;

    @Value("${spring.datasource.hikari.minimum-idle}")
    private int minIdle;

    @Value("${spring.datasource.hikari.idle-timeout}")
    private long idleTimeout;

    @Value("${spring.datasource.hikari.max-lifetime}")
    private long maxLifetime;

    @Value("${spring.datasource.hikari.pool-name}")
    private String poolName;
    @Bean
    public DataSource dataSource(){
        HikariConfig hikari = new HikariConfig();
        hikari.setJdbcUrl(url);
        hikari.setUsername(username);
        hikari.setPassword(password);
        hikari.setDriverClassName(driverClassName);
        hikari.setConnectionTimeout(connectionTimeout);
        hikari.setMaximumPoolSize(maxPoolSize);
        hikari.setMinimumIdle(minIdle);
        hikari.setIdleTimeout(idleTimeout);
        hikari.setMaxLifetime(maxLifetime);
        hikari.setPoolName(poolName);
        return new HikariDataSource(hikari);


    }
}
