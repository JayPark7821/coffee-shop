package kr.jay.coffeeshop.domain.point

import jakarta.persistence.*
import kr.jay.coffeeshop.domain.order.Order

/**
 * PointUseLog
 *
 * @author jaypark
 * @version 1.0.0
 * @since 11/14/23
 */
@Entity
class PointUseLog private constructor(
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "point_id", nullable = false, updatable = false, insertable = false)
    val point: Point,

    val usedPoint: Long,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false, updatable = false, insertable = false)
    val order: Order,
    status: PointUseStatus,
) {

    companion object{
        fun log(point: Point, usedPoint: Long, order: Order): PointUseLog {
            return PointUseLog(point, usedPoint, order, PointUseStatus.USED)
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "point_use_log_id")
    val id: Long = 0

    @Enumerated(EnumType.STRING)
    var status: PointUseStatus = status
        private set
}