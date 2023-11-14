package kr.jay.coffeeshop.interfaces.menu

import kr.jay.coffeeshop.interfaces.menu.dto.HotMenuResponse
import kr.jay.coffeeshop.interfaces.menu.dto.MenuResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MenuControllerImpl : MenuController {

    @GetMapping("/v1/menu")
    override fun getMenu(): List<MenuResponse> {
        TODO("Not yet implemented")
    }

    @GetMapping("/v1/menu/hot")
    override fun hotMenu(): List<HotMenuResponse> {
        TODO("Not yet implemented")
    }
}