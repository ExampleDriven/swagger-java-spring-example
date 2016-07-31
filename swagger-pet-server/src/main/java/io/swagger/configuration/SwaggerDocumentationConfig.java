package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-30T05:42:17.531Z")

@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Swagger Petstore (Simple)")
            .description("A sample API that uses a petstore as an example to demonstrate features in the swagger-2.0 specification")
            .license("MIT")
            .licenseUrl("http://opensource.org/licenses/MIT")
            .termsOfServiceUrl("http://swagger.io")
            .version("1.0.0")
            .contact(new Contact("","", "foo@example.com"))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.joda.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.joda.time.DateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
