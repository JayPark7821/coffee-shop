package kr.jay.coffeeshop.interfaces.point

import kr.jay.coffeeshop.interfaces.point.dto.PointChargeRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PointControllerImpl : PointController {

    @PostMapping("/v1/charge")
    override fun charge(request: PointChargeRequest) {
        TODO("Not yet implemented")
    }
}