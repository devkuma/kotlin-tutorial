package basic.fuctions.extension

class Host(val hostname: String) {
    fun printHostname() {
        print(hostname)
    }
}

class Connection(val host: Host, val port: Int) {
    fun printPort() {
        print(port)
    }

    fun Host.printConnectionString() {
        printHostname()   // 'Host.printHostname()'를 호출한다.
        print(":")
        printPort()   // 'Connection.printPort()'를 호출한다.
    }

    fun connect() {
        /*...*/
        host.printConnectionString()   // 확장 함수을 호출한다.
    }
}

fun main() {
    Connection(Host("kotl.in"), 443).connect()
    //Host("kotl.in").printConnectionString()  // 에러, 연결 외부에서 확장 기능을 사용할 수 없다.
}