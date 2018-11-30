package net.thrymr.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.swing.*;

@SpringBootApplication
public class CustomerApplication {

    public static void main(String []args){
        SpringApplication.run(CustomerApplication.class,args);
    }
}
