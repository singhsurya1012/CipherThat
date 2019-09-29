package com.encrypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EncryptMeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EncryptMeApplication.class, args);
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("API for Handling Encryption of File and Text")
                .description(
                        "Encryption Apis")
                .termsOfServiceUrl("").version("1").contact(new Contact("Surya Singh", "https://github.com/singhsurya1012", "singhsurya1012@gmail.com")).build();
    }

    @Bean
    public Docket configureSwagger() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.encryptme")).build()
                .apiInfo(apiInfo());
    }

}
