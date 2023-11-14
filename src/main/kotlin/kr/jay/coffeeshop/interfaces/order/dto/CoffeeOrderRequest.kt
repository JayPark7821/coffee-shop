package kr.jay.coffeeshop.interfaces.order.dto

/**
 * CoffeeOrderRequest
 *
 * @author jaypark
 * @version 1.0.0
 * @since 11/13/23
 */
data class CoffeeOrderRequest(
    val userId: Long,
    val menuId: Long,
)
