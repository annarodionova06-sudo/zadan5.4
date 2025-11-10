fun main() {
    val t = Triangle()
    
    // Ввод точек
    println("Точка A (x y):")
    val inputA = readln().split(" ")
    t.A.x = inputA[0].toDouble()
    t.A.y = inputA[1].toDouble()
    
    println("Точка B (x y):")
    val inputB = readln().split(" ")
    t.B.x = inputB[0].toDouble()
    t.B.y = inputB[1].toDouble()
    
    println("Точка C (x y):")
    val inputC = readln().split(" ")
    t.C.x = inputC[0].toDouble()
    t.C.y = inputC[1].toDouble()
    
    // Формулы для центра описанной окружности
    val x1 = t.A.x
    val y1 = t.A.y
    val x2 = t.B.x
    val y2 = t.B.y
    val x3 = t.C.x
    val y3 = t.C.y
    
    val D = 2 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))
    
    val Ux = ((x1*x1 + y1*y1) * (y2 - y3) + 
              (x2*x2 + y2*y2) * (y3 - y1) + 
              (x3*x3 + y3*y3) * (y1 - y2)) / D
              
    val Uy = ((x1*x1 + y1*y1) * (x3 - x2) + 
              (x2*x2 + y2*y2) * (x1 - x3) + 
              (x3*x3 + y3*y3) * (x2 - x1)) / D
    
    // Радиус
    val R = sqrt((Ux - x1).pow(2) + (Uy - y1).pow(2))
    
    println("Центр: (${"%.2f".format(Ux)}, ${"%.2f".format(Uy)})")
    println("Радиус: ${"%.2f".format(R)}")
}
