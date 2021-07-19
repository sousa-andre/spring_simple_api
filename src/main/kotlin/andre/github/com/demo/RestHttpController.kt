package andre.github.com.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1")
class RestHttpController {
    @GetMapping("/users")
    fun users(): String {
        return "User 1"
    }
}
