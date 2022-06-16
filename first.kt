fun main() {

    while(true) {
        
        println("შეიყვანეთ X ცვლადის მნიშვნელობა")
        val x = readLine()
        println("შეიყვანეთ Y ცვლადის მნიშვნელობა")
        val y = readLine()
        var z = 0.0
        var ANSWER :String
        
        try {
            if (x != null && y != null)
                z = x.toDouble() + y.toDouble()
            println("X და Y ჯამი არის: $z ")
            
            while (true) {
                println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
                ANSWER = readLine().toString()
                if (ANSWER == "არა" || ANSWER == "დიახ") break
                else println("შეიყვანეთ დიახ ან არა")
            }
            if (ANSWER == "არა")
                break
            else continue
        }
        catch (exception: NumberFormatException) {
            println("მონაცემები არასწორია, სცადეთ ხელახლა")
        }
        
    }
    
}
