package andre.github.com.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringSimpleAPI

fun main(args: Array<String>) {
	runApplication<SpringSimpleAPI>(*args)
}