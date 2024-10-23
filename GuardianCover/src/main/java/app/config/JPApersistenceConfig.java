package app.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.BeanProperty;
import java.util.Properties;

@Configuration
@EnableJpaRepositories("app")
@ComponentScan("app")

public class JPApersistenceConfig {


    @Bean
    public DataSource dataSource(){
        HikariDataSource hikari = new HikariDataSource();
        hikari.setJdbcUrl("jdbc:postgresql://localhost:5432/guardian");
        hikari.setUsername("postgres");
        hikari.setPassword("1360");
        hikari.setDriverClassName("org.postgresql.Driver");
        return hikari;


    }
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan("app");
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        return em;


    }
    @Bean
    public PlatformTransactionManager transactionManager () {

        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());

        return transactionManager;
    }


}
