package br.com.rbarbioni.gcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class GcloudSpringBootStarterApplication  extends SpringBootServletInitializer {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GcloudSpringBootStarterApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(GcloudSpringBootStarterApplication.class, args);
	}
}
