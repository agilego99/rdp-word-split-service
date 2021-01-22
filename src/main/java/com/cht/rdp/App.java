package com.cht.rdp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Word-Split
 * @author aaron
 * @date
 * @about	https://github.com/NLPchina/ansj_seg/wiki
 * @about	Swagger web sit	http://localhost:8083/swagger-ui.html
 */
@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		log.info("Swagger web sit\thttp://localhost:8083/swagger-ui.html");
	}
}