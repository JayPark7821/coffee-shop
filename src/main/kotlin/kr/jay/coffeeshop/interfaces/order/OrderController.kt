package kr.jay.coffeeshop.interfaces.order

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import kr.jay.coffeeshop.interfaces.order.dto.CoffeeOrderRequest
import org.springframework.web.bind.annotation.RequestBody

/**
 * OrderController
 *
 * @author jaypark
 * @version 1.0.0
 * @since 11/13/23
 */
@Tag(name = "OrderController", description = "주문 관련 API")
interface OrderController {


    @Operation(
        summary = "커피 주문 API",
        description = "커피 주문 API"
    )
    fun order(@RequestBody request: CoffeeOrderRequest)
}