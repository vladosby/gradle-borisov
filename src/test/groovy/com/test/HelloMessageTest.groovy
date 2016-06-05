package com.test

import spock.lang.Specification

/**
 * Created by vlados on 6/5/2016.
 */
class HelloMessageTest extends Specification {
    def "GetMessage"() {
        expect:
        "I am project".equals(new HelloMessage().getMessage())
        println new HelloMessage().getMessage()
    }
}
