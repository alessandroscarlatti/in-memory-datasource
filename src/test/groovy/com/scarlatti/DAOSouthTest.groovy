package com.scarlatti

import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

@SpringBootTest(classes = [App])
@ActiveProfiles(["default", "south", "integration"])
class DAOSouthTest extends Specification {

	@Autowired
	DAO dao

	@Test
	"can load in-memory datasource south"() {
		when:
			int result = dao.countPenguins()
		then:
			result == 3
			println "loaded datasource."
	}
}
