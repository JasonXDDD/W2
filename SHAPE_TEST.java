import java.util.Scanner;

/**
 * Created by JASON_ on 2015/3/3.
 */
public class SHAPE_TEST {

    public static void main(String[] args){
        int type = 1;
        int height = 0;
        int width = 0;
        char filled;

        Scanner sc;
        char flag;
        boolean FlagToStop = true;
        Shape shape1;

        while(FlagToStop){
            System.out.println("1.Rectangle");
            System.out.println("2.Square");
            System.out.println("3.Upper Left Triangle");
            System.out.println("4.Upper Right Triangle");
            System.out.println("5.Down Left Triangle");
            System.out.println("6.Down Right Triangle");
            System.out.println("7.Upper Isosceles");
            System.out.println("8.Down Isosceles");
            System.out.println("9.Right Parallelogram");
            System.out.println("10.Left Parallelogram");
            System.out.printf("Choose your type: ");
            sc = new Scanner(System.in);
            type = sc.nextInt();
            System.out.printf("Enter the Height: ");
            sc = new Scanner(System.in);
            height = sc.nextInt();

            if(type == 1 || type == 9 || type == 10){
                System.out.printf("Enter the Width: ");
                sc = new Scanner(System.in);
                width = sc.nextInt();
            }
            System.out.printf("Is it filled(y/n)?? ");
            sc = new Scanner(System.in);
            filled = sc.next().charAt(0);
            System.out.println();

            switch (type){
                case Shape.Consrectangle:
                    shape1 = new Rect(height, width, filled);
                    shape1.show();
                    break;
                case Shape.Conssquare:
                    shape1 = new Square(height, filled);
                    shape1.show();
                    break;
                case Shape.Consupperleft:
                    shape1 = new UpperLeft(height, filled);
                    shape1.show();
                    break;
                case Shape.Consupperright:
                    shape1 = new UpperRight(height, filled);
                    shape1.show();
                    break;
                case Shape.Consdownleft:
                    shape1 = new DownLeft(height, filled);
                    shape1.show();
                    break;
                case Shape.Consdownright:
                    shape1 = new DownRight(height, filled);
                    shape1.show();
                    break;
                case Shape.Consupperisosceles:
                    shape1 = new UpperIsosceles(height, filled);
                    shape1.show();
                    break;
                case Shape.Consdownisosceles:
                    shape1 = new DownIsosceles(height, filled);
                    shape1.show();
                    break;
                case Shape.Consrightparallelogram:
                    shape1 = new Right(height, width, filled);
                    shape1.show();
                    break;
                case Shape.Consleftparallelogram:
                    shape1 = new Left(height, width, filled);
                    shape1.show();
                    break;
            }

            System.out.println();
            System.out.printf("Next one(y/n)??");
            sc = new Scanner(System.in);
            flag = sc.next().charAt(0);
            if(flag == 'y' || flag == 'Y')
                FlagToStop = true;
            if(flag == 'n' || flag == 'N')
                FlagToStop = false;
        }
    }
}
