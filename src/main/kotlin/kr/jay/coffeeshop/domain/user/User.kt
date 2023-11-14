package kr.jay.coffeeshop.domain.user

import jakarta.persistence.*

/**
 * User
 *
 * @author jaypark
 * @version 1.0.0
 * @since 11/14/23
 */

@Entity
@Table(name = "user_table")
class User(
    name: String,
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    val id: Long = 0

    @Column(nullable = false)
    var name: String = name
        private set
}