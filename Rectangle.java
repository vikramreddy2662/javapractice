package JavaPractice;

class areaCalculator{
    public int Area(int length,int breadth){

        return length *breadth;
    }
    public int perimeter(int l,int b){
        return 2*(l+b);
    }
}
public class Rectangle {
    public static void main(String[] args){
        areaCalculator a=new areaCalculator();
        System.out.println(a.Area(21,45));
        System.out.println(a.perimeter(9,8));
    }
}
