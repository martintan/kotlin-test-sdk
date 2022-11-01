actual object TestFactory {
    actual fun createTest(): Test = NativeTest
}

object NativeTest : Test {
    override fun init() {
        println("Initializing SDK")
    }
    override fun ping(): String {
        return "PONG"
    }
}