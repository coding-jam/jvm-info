package it.cosenonjaviste.jvminfo;

import it.cosenonjaviste.jvminfo.resources.JvmInfoResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class JvmInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JvmInfoApplication.class, args);
	}

	@Configuration
	public static class JerseyConfiguration extends ResourceConfig {

		public JerseyConfiguration() {
			register(JvmInfoResource.class);
		}
	}
}
