package study.kotlin_playground.controller

import org.springframework.stereotype.Component

@Component
class UserEventPublisher (
    private val userEventListener: UserEventListener
){

    fun publish(serviceName: String) {
        println("이벤트 발행")
        userEventListener.count(serviceName)
    }
}