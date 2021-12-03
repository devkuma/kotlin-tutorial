package basic.classes

class User4 {
    var name: String
    var age: Int = -1

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}