package com.cht.rdp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Word-Split
 * @author aaron
 * @date
 * @about	https://github.com/NLPchina/ansj_seg/wiki
 * @about	Swagger sit	http://localhost:8083/swagger-ui.html
 */
@EnableDiscoveryClient
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args
		);
	}
}