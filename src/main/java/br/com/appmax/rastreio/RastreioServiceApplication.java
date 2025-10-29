package br.com.appmax.rastreio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// aqui ignora qualquer configuração do banco (por enquanto)
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        JpaRepositoriesAutoConfiguration.class
})
public class RastreioServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RastreioServiceApplication.class, args);
    }

}