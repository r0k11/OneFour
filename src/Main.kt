fun main()
{
    println("Введите два числа и операцию (например: 5.5 2.0 +):")
    val input = readLine()
    if (input != null)
    {
        val parts = input.split(" ")
        if (parts.size == 3)
        {
            val number1 = parts[0].toDoubleOrNull()
            val number2 = parts[1].toDoubleOrNull()
            val operation = parts[2]
            if (number1 != null && number2 != null)
            {
                val result = when (operation)
                {
                    "+" -> number1 + number2
                    "-" -> number1 - number2
                    "*" -> number1 * number2
                    "/" -> if (number2 != 0.0) number1 / number2 else "Ошибка: деление на ноль"
                    else -> "Ошибка: неверная операция"
                }
                println("Результат: $result")
            }
            else
            {
                println("Ошибка: введите корректные числа.")
            }
        }
        else
        {
            println("Ошибка: введите данные в формате 'ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ'.")
        }
    }
    else
    {
        println("Ошибка: ввод не может быть пустым.")
    }
}
