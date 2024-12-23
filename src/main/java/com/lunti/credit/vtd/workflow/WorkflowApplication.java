package com.lunti.credit.vtd.workflow;

import com.lunti.credit.vtd.workflow.service.MyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {org.activiti.spring.boot.SecurityAutoConfiguration.class})
public class WorkflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkflowApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(final MyService myService) {

        return new CommandLineRunner() {
            public void run(String... strings) throws Exception {
                myService.createDemoUsers();
            }
        };

    }
}

