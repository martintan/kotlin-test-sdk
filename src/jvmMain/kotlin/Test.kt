import java.util.*

actual object TestFactory {
    actual fun createTest(): Test = JvmTest
}

object JvmTest : Test {
    override fun init() {
        println("Initializing SDK")
    }
    override fun ping(): String {
        return "PONG"
    }
}