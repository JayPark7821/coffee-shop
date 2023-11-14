package kr.jay.coffeeshop.interfaces.menu.dto

/**
 * MenuResponse
 *
 * @author jaypark
 * @version 1.0.0
 * @since 11/13/23
 */
data class MenuResponse(
    val menuId: Long,
    val name: String,
    val price: Long,
) {
}