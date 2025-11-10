import kotlin.math.sqrt
import kotlin.math.pow

class Point {
    // Свойство: координата X точки
    var x: Double = 0.0

    // Свойство: координата Y точки
    var y: Double = 0.0

    // Метод для ввода координат точки с клавиатуры
    fun inputPoint(pointName: String) {
        while (true) {
            println("Введите координаты точки $pointName (x y):")
            try {
                // Читаем ввод и разбиваем на части по пробелам
                val input = readln().split(" ")
                // Проверяем что введено ровно два числа
                if (input.size != 2) {
                    println("Ошибка! Введите две координаты через пробел")
                    continue
                }
                // Преобразуем строки в числа и сохраняем в свойствах
                x = input[0].toDouble()
                y = input[1].toDouble()
                break  // Выходим из цикла если все успешно
            } catch (e: Exception) {
                // Обрабатываем ошибку если введены не числа
                println("Ошибка! Введите числа")
            }
        }
    }

    fun distanceTo(other: Point): Double {
        val dx = x - other.x
        val dy = y - other.y
        return sqrt(dx * dx + dy * dy)
    }
}
