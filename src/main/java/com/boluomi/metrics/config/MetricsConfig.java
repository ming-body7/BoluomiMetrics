package com.boluomi.metrics.config;

import com.boluomi.metrics.DataMetricsFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.OncePerRequestFilter;

@Configuration
public class MetricsConfig {
    @Bean
    public OncePerRequestFilter dataLogFilter() {
        return new DataMetricsFilter();
    }
}
