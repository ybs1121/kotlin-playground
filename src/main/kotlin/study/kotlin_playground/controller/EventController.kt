package study.kotlin_playground.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EventController(
    private val eventService: EventService
) {


    @GetMapping("/events")
    fun getEvent(usrId: String): String {
        return eventService.getEvent(usrId)
    }
}