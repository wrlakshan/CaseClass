//19000792

object CaseClass{
    case class Point(x:Int, y:Int){
        def +(that:Point)=Point(this.x+that.x,this.y+that.y)
        def move(dx:Int, dy:Int)=Point(dx+this.x, dy+this.y)
        def distance(p0:Point)=Point(this.x-p0.x, this.y-p0.y)
        def invert=Point(this.y, this.x)    
    }

    def main(args: Array[String]): Unit = {
        val p1 = Point(4, 7)
        val p2 = Point(1,3)
        val p3 = p1 + p2
        println(" P1 = "+p1)
        println(" P2 = "+p2)
        println(" Add p1 + p2 = "+p3)
        println(" Move p1(2,1) of distance = "+p1.move(2,1))
        println(" distance between p1 and p2 = "+ p1.distance(p2))
        println(" Invert p1 cordinates = "+ p1.invert)
    }
}