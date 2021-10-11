package basic.classes.enums

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

fun main() {
    println(ProtocolState.TALKING.signal())
    println(ProtocolState.WAITING.signal())
}
