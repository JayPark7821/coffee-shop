package kr.jay.coffeeshop.interfaces.menu

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import kr.jay.coffeeshop.interfaces.menu.dto.HotMenuResponse
import kr.jay.coffeeshop.interfaces.menu.dto.MenuResponse

/**
 * MenuController
 *
 * @author jaypark
 * @version 1.0.0
 * @since 11/13/23
 */
@Tag(name = "MenuController", description = "메뉴 관련 API")
interface MenuController {


    @Operation(
        summary = "메뉴 조회 API",
        description = "메뉴 조회 API"
    )
    fun getMenu(): List<MenuResponse>

    @Operation(
        summary = "인기 메뉴 조회 API",
        description = "인기 메뉴 조회 API"
    )
    fun hotMenu(): List<HotMenuResponse>
}