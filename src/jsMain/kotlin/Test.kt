import kotlinx.browser.window

actual object TestFactory {
    actual fun createTest(): Test = JsTest
}

object JsTest : Test {
    override fun init() {
        println("Initializing SDK")
    }
    override fun ping(): String {
        return "PONG"
    }
}