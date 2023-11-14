package kr.jay.coffeeshop.interfaces.order

import kr.jay.coffeeshop.interfaces.order.dto.CoffeeOrderRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderControllerImpl : OrderController {

    @PostMapping("/v1/order")
    override fun order(request: CoffeeOrderRequest) {
        TODO("Not yet implemented")
    }
}