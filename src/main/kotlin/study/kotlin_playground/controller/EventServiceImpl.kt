package study.kotlin_playground.controller

import org.springframework.stereotype.Service

@Service
class EventServiceImpl(
    private val userEventPublisher: UserEventPublisher
) : EventService {

    override fun getEvent(usrId: String): String {
        if (usrId == "ex") {
            throw IllegalStateException("예외 발생")
        }
        println("usrId: $usrId 가 이벤트를 조회했다.")
        userEventPublisher.publish("EventService");
        return usrId
    }
}