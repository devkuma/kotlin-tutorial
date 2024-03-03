package basic.annotations.ex3

annotation class ReplaceWith(val expression: String)

annotation class Deprecated(
    val message: String,
    val replaceWith: ReplaceWith = ReplaceWith(""), // @를 넣지 않았다.
)

@Deprecated("This function is deprecated, use === instead", ReplaceWith("this === other"))
class Foo {
    // ...
}