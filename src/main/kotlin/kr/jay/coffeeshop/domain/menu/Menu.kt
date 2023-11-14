package kr.jay.coffeeshop.domain.menu

import jakarta.persistence.*

/**
 * Menu
 *
 * @author jaypark
 * @version 1.0.0
 * @since 11/14/23
 */
@Entity
@Table(name = "menu_table")
class Menu private constructor(
    name: String,
    price: Int,
) {

    companion object{
        fun addNewMenu(name: String, price: Int): Menu {
            return Menu(name, price)
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

    @Column(nullable = false)
    var name: String = name
        private set

    @Column(nullable = false)
    var price: Int = price
        private set
}