package net.gaeco.webdemo.controller

import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.data.redis.core.ValueOperations
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
@RequestMapping("/redis")
class RedisController {
    @Autowired
    StringRedisTemplate redisTemplate

    @GetMapping("/string")
    def getRedisSampleStringValue01(){
        long startTime = System.currentTimeMillis()
        String key = "myKey"
        ValueOperations<String, String> stringValueOperations = redisTemplate.opsForValue()
        stringValueOperations.set(key, "1") // redis set 명령어
        String result1 = stringValueOperations.get(key) // redis get 명령어
        log.info("result1 = $result1")

        stringValueOperations.increment(key) // redis incr 명령어
        String result2 = stringValueOperations.get(key)

        log.info("result2 = $result2")
        long duration = System.currentTimeMillis() - startTime
        return [result1:result1, result2:result2, duration:duration, status:"OK"]
    }

}