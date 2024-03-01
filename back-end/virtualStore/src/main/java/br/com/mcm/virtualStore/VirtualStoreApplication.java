package br.com.mcm.virtualStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages = {"br.*"})
@EnableTransactionManagement
public class VirtualStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualStoreApplication.class, args);
	}

}
