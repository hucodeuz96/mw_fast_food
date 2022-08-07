package com.example.adminservice.lang;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * @author "Husniddin Ulachov"
 * @created 11:46 AM on 8/5/2022
 * @project AdminService
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/index")
public class IndexController {
    private final LocaleConfirguration localeConfirguration;
    @GetMapping("/translation")
    private ResponseEntity<String> getTrans(@RequestHeader("Accept-Language") String locale){
        String message = localeConfirguration.messageSource().getMessage("greetings", null, Locale.forLanguageTag(locale));
        return ResponseEntity.ok(message);
    }


}
