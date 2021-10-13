public class Main {
    /*
    Програма працює для умови коли в конструктор вносяться: 1) катети для прямокутнього трикутника
    2) бічна сторона і кут між бічними сторонами для рля рівнебедренного
    Інакше умова завдання не несе жодного сенсу
    */
    public static void main(String[] args) {
        Triangle t1= new Rectangular_triangle(6, 8);
        System.out.println(t1.calcPerimeter());
        System.out.println(t1.calcSquare());
        Triangle t2= new Isosceles_tricycle(5, Math.PI/6);
        System.out.println(t2.calcPerimeter());
        System.out.println(t2.calcSquare());
    }
}
