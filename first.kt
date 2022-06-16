/* Online Kotlin Compiler */
fun main() {

    while(true) {
        
        println("შეიყვანეთ X ცვლადის მნიშვნელობა")
        val x = readLine()
        println("შეიყვანეთ Y ცვლადის მნიშვნელობა")
        val y = readLine()
        var z = 0.0
        
        try {
            if (x != null && y != null)
                z = x.toDouble() + y.toDouble()
            println("Z = $z")
            break
        }
        catch (exception: NumberFormatException) {
            println("მონაცემები არასწორია, სცადეთ ხელახლა")
        }
    }
    
}