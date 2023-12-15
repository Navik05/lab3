import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int type,i;
        double e;
        double[] sides = new double[3];
        square one = null;
        circle two = null;
        triangle three = null;
        Scanner in = new Scanner(System.in);
        System.out.printf("\n1-квадрат\n2-круг\n3-треугольник\nВыберите фигуру:");
        type = in.nextInt();
        //Ввод и обработка
        switch (type) {
            case 1:
                System.out.printf("Длина стороны квадрата:");
                e = in.nextDouble();
                one = new square(e);
                one.workSquare();
                break;
            case 2:
                System.out.printf("Радиус круга:");
                e = in.nextDouble();
                two = new circle(e);
                two.workCircle();
                break;
            case 3:
                System.out.printf("Длина сторон треугольника:");
                for(i=0;i<3;i++)
                {
                    sides[i]=in.nextDouble();
                }
                three = new triangle(sides);
                three.workTriangle();
            default:;
        }
    }
}
