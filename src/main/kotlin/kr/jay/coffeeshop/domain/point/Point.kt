package kr.jay.coffeeshop.domain.point

import jakarta.persistence.*
import kr.jay.coffeeshop.domain.user.User

/**
 * Point
 *
 * @author jaypark
 * @version 1.0.0
 * @since 11/14/23
 */
@Entity
@Table(name = "point_table")
class Point private constructor(
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    val user: User,
    chargedPoint: Long,
    remainingPoint: Long,
    pointUseLog: MutableList<PointUseLog>,
) {

    companion object{
        fun chargePoint(user: User, chargeAmount: Long): Point {
            return Point(user, chargeAmount, chargeAmount, mutableListOf())
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "point_id")
    val id: Long = 0

    var chargedPoint: Long = chargedPoint
        private set

    var remainingPoint: Long = remainingPoint
        private set

    @OneToMany(mappedBy = "point", cascade = [CascadeType.ALL], orphanRemoval = true)
    var pointUseLog: MutableList<PointUseLog> = pointUseLog
        private set
}