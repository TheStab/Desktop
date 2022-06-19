
fun main() {

    var input = "527"
    //var inLength = input.length
    var output = ""


    /*when (inLength) {
        1 -> print("message")
        2 -> print("message")
        3 -> print("message")
    }*/


    when (input[0]) {
        '1' -> output = "ას"
        '2' -> output = "ორას"
        '3' -> output = "სამას"
        '4' -> output = "ოთხას"
        '5' -> output = "ხუთას"
        '6' -> output = "ექვსას"
        '7' -> output = "შვიდას"
        '8' -> output = "რვაას"
        '9' -> output = "ცხრაას"
    }
    when (input[1]) {
        '2' -> output = "ოცდა"
        '3' -> output = "ოცდა"
        '4' -> output = "ორმოცდა"
        '5' -> output = "ორმოცდა"
        '6' -> output = "სამოცდა"
        '7' -> output = "სამოცდა"
        '8' -> output = "ოთხმოცდა"
        '9' -> output = "ოთხმოცდა"
    }
    
    if (input[1] == '0' || input[1] == '1' || input[1] == '2' || input[1] == '4'|| input[1] == '6' || input[1] == '8') {

        when (input[2]) {
            '0' -> output += "ი"
            '1' -> output += "ერთი"
            '2' -> output += "ორი"
            '3' -> output += "სამი"
            '4' -> output += "ოთხი"
            '5' -> output += "ხუთი"
            '6' -> output += "ექვსი"
            '7' -> output += "შვიდი"
            '8' -> output += "რვა"
            '9' -> output += "ცხრა"
        }

    }

    if (input[1] == '3' || input[1] == '5' || input[1] == '7' || input[1] == '9') {

        when (input[2]) {
            '0' -> output += "ი"
            '1' -> output += "თერთმეტი"
            '2' -> output += "თორმეტი"
            '3' -> output += "ცამეტი"
            '4' -> output += "თოთხმეტი"
            '5' -> output += "თხუთმეტი"
            '6' -> output += "თექვსმეტი"
            '7' -> output += "ჩვიდმეტი"
            '8' -> output += "თვრამეტი"
            '9' -> output += "ცხრამეტი"
        }

    }
    println(output)
}