package study.kotlin_playground.controller

import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class UserEventListener {
    companion object {
        var count = 0;
    }

    @EventListener
    @Async
    fun count(serviceName: String) {
        count++;
        println("serviceName : $serviceName count: $count")
    }
}