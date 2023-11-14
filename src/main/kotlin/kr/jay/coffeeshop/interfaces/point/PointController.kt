package kr.jay.coffeeshop.interfaces.point

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import kr.jay.coffeeshop.interfaces.point.dto.PointChargeRequest
import org.springframework.web.bind.annotation.RequestBody

/**
 * PointController
 *
 * @author jaypark
 * @version 1.0.0
 * @since 11/13/23
 */

@Tag(name = "PointController", description = "포인트 관련 API")
interface PointController {

    @Operation(
        summary = "포인트 충전 API",
        description = "포인트 충전 API"
    )
    fun charge(@RequestBody request: PointChargeRequest)
}