package kr.jay.coffeeshop.interfaces.point.dto

/**
 * PointChargeRequest
 *
 * @author jaypark
 * @version 1.0.0
 * @since 11/13/23
 */
data class PointChargeRequest(
    val userId: Long,
    val amount: Long,
)
