package kr.jay.coffeeshop.interfaces.menu.dto

/**
 * HotMenuResponse
 *
 * @author jaypark
 * @version 1.0.0
 * @since 11/13/23
 */
data class HotMenuResponse(
    val menuId: Long,
    val name: String,
    val orderCount: Long,
)