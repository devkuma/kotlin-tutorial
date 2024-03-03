package basic.annotations.ex2

annotation class MyClass(val parameter: String)

@MyClass("parameter")
class Foo {
    // ...
}


