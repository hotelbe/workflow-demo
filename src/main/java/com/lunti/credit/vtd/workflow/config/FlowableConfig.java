package com.lunti.credit.vtd.workflow.config;

import org.flowable.common.engine.impl.history.HistoryLevel;
import org.flowable.spring.SpringProcessEngineConfiguration;
import org.flowable.spring.boot.EngineConfigurationConfigurer;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

@Configuration
public class FlowableConfig implements EngineConfigurationConfigurer<SpringProcessEngineConfiguration> {

    @Override
    public void configure(SpringProcessEngineConfiguration engineConfiguration) {
        try {
            Resource[] resources = new PathMatchingResourcePatternResolver()
                    .getResources("classpath:/processes/*.bpmn20.xml");
            engineConfiguration.setDeploymentResources(resources);
            engineConfiguration.setDatabaseSchemaUpdate("true");
            engineConfiguration.setDbHistoryUsed(true);
            engineConfiguration.setHistoryLevel(HistoryLevel.FULL);
        } catch (IOException e) {
            throw new RuntimeException("Could not load process definitions", e);
        }
    }
} 