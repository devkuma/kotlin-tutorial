import java.time.LocalDateTime
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter


fun main() {

    val date = "2022-04-15 00:00:00 +0900"
    val zonedDateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ZZZ")

    val localDateTime = LocalDateTime.parse(date, zonedDateTimeFormat)
    val zonedDateTime = ZonedDateTime.parse(date, zonedDateTimeFormat)

    println(localDateTime)
    println(zonedDateTime)
    println(zonedDateTime.toLocalDateTime())


    println("-------------")

    println(zonedDateTimeFormat.format(LocalDateTime.now()))

    println("-------------")


    println(LocalDateTime.now())
    println(ZonedDateTime.now())
    println(ZonedDateTime.now().toLocalDateTime())
}