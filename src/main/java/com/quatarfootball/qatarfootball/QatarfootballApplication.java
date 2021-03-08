package com.quatarfootball.qatarfootball;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan
public class QatarfootballApplication {

	public static void main(String[] args) {
		SpringApplication.run(QatarfootballApplication.class, args);
	}

}
