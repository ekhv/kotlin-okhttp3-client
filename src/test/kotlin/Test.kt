import org.example.response
import org.junit.Test
import kotlin.test.assertEquals


class Test {
    @Test
    fun `check response`() {
        assertEquals("true", response().success)
    }
}