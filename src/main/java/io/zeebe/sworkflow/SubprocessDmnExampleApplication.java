package io.zeebe.sworkflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import io.camunda.zeebe.spring.client.annotation.Deployment;

@SpringBootApplication
@EnableZeebeClient
@Deployment(resources = { "classpath*:*.bpmn", "classpath*:*.dmn"})
public class SubprocessDmnExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubprocessDmnExampleApplication.class, args);
	}

}
