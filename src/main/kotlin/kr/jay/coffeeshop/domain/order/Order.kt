package kr.jay.coffeeshop.domain.order

import jakarta.persistence.*
import kr.jay.coffeeshop.domain.user.User

/**
 * Order
 *
 * @author jaypark
 * @version 1.0.0
 * @since 11/14/23
 */
@Entity
@Table(name = "order_table")
class Order private constructor(
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, updatable = false, insertable = false)
    val user: User,
    status: OrderStatus,
) {

    companion object{
        fun placeOrder(user: User, orderedMenuVo: List<OrderMenuVo>): Order {
            return Order(user,  OrderStatus.ORDERED).apply {
                this.orderMenuList = orderedMenuVo.map { it.toEntity(this) }
            }
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    val id: Long = 0

    @OneToMany(mappedBy = "order", cascade = [CascadeType.ALL], orphanRemoval = true)
    @Column(nullable = false)
    var orderMenuList: List<OrderedMenu> = listOf()
       private set

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    var status: OrderStatus = status
        private set

}

data class OrderMenuVo(
    val name: String,
    val individualPrice: Int,
    val quantity: Int,
){
    fun toEntity(order: Order): OrderedMenu {
        return OrderedMenu.create(name, individualPrice, quantity, order)
    }
}