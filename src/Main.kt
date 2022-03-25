import kotlin.math.sqrt

fun main(){
    val p1 = Point(10,-20)
    val p2 = Point(10,20)

    println(p1.distance(p2))
}


interface Int1{
    fun to_String() : String
    fun compareTo(obj:Point) : Boolean
    fun moveSimetrial() : Unit
    fun distance(point: Point) : Double

}

class Point(var x : Int, var y:Int) : Int1{

    override fun to_String(): String {
        return "x:$x y:$y"
    }


    override fun compareTo(obj: Point): Boolean {
        return this.x == obj.x && this.y == obj.y
    }

    override fun moveSimetrial() {
        val simetrialX = this.x * -1
        val simetrialY = this.y * -1
        this.x = simetrialX
        this.y = simetrialY
    }

    override fun distance(point: Point): Double {
        return sqrt(((point.x - this.x ) * (point.x - this.x ) + (point.y - this.y ) * (point.y - this.y)).toDouble())
    }
}



