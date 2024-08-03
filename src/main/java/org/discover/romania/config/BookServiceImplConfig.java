package org.discover.romania.config;

import org.discover.romania.service.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookServiceImplConfig {
    @Bean
    public BookServiceImpl bookServiceImpl() {
        return new BookServiceImpl();
    }
}
