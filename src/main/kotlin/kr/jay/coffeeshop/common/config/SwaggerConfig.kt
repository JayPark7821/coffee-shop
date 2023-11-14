package kr.jay.coffeeshop.common.config

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.models.OpenAPI
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
/**
 * SwaggerConfig
 *
 * @author jaypark
 * @version 1.0.0
 * @since 11/13/23
 */

@OpenAPIDefinition(
    info = Info(
        title = "Coffee Shop API",
        version = "v1",
        description = "Coffee Shop API"
    )
)
@Configuration
class SwaggerConfig