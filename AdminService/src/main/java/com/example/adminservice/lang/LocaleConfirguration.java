package com.example.adminservice.lang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

/**
 * @author "Husniddin Ulachov"
 * @created 10:32 AM on 8/5/2022
 * @project AdminService
 */
@Configuration
public class LocaleConfirguration {
    @Value("${app.baseName}")
    private String baseName;

    @Value("${app.defaultLocale}")
    private String defaultLocale;

    @Bean
    public ResourceBundleMessageSource messageSource(){
        ResourceBundleMessageSource rs = new ResourceBundleMessageSource();
        rs.setBasename(baseName);
        rs.setUseCodeAsDefaultMessage(true);
        rs.setCacheSeconds(3600);
        rs.setDefaultEncoding("UTF-8");
        return rs;
    }
    @Bean
    public LocaleResolver localeResolver(){
        SessionLocaleResolver sl = new SessionLocaleResolver();
        sl.setDefaultLocale(new Locale(defaultLocale));
        return sl;
    }
}
