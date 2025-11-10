import kotlin.math.sqrt
import kotlin.math.pow
class Triangle {
    val A = Point()
    val B = Point()
    val C = Point()
    
    fun inputTriangle() {
        A.inputPoint("A")
        B.inputPoint("B") 
        C.inputPoint("C")
    }
