package com.example.adminservice.lang;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * @author "Husniddin Ulachov"
 * @created 10:57 AM on 8/5/2022
 * @project AdminService
 */
@Component
@RequiredArgsConstructor
public class Translator {
    private static ResourceBundleMessageSource messageSource;

    public Translator(@Qualifier("texts")ResourceBundleMessageSource messageSource){
        Translator.messageSource = messageSource;
    }


}
