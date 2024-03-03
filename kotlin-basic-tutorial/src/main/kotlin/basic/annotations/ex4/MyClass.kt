package basic.annotations.ex4


import kotlin.reflect.KClass

annotation class MyClass(val arg1: KClass<*>, val arg2: KClass<out Any>)

@MyClass(String::class, Int::class)
class Foo