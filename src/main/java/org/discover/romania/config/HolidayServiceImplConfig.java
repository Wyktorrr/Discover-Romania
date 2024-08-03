package org.discover.romania.config;

import org.discover.romania.service.HolidayServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HolidayServiceImplConfig {
    @Bean
    public HolidayServiceImpl holidayServiceImpl() {
        return new HolidayServiceImpl();
    }
}
