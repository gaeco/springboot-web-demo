package net.gaeco.webdemo

import spock.lang.Specification

class RedisCliTest extends Specification {

    def "configTest"(){
        setup:
        Properties prop = new Properties()


        when:
        //FrameworkConfig.setProp(prop)
        println 'hello'

        then:
        println "-----------------"


    }
}