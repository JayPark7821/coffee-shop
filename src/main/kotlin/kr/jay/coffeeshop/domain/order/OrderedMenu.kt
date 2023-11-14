package kr.jay.coffeeshop.domain.order

import jakarta.persistence.*

/**
 * OrderedMenu
 *
 * @author jaypark
 * @version 1.0.0
 * @since 11/14/23
 */

@Entity
class OrderedMenu private constructor(
    val name: String,
    val individualPrice: Int,
    val quantity: Int,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false, updatable = false, insertable = false)
    val order: Order,
) {
    companion object {
        fun create(name: String, individualPrice: Int, quantity: Int, order: Order): OrderedMenu {
            return OrderedMenu(name, individualPrice, quantity, order)
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
}