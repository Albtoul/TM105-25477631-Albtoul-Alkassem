
import java.util.Scanner;

    public class TriangleArea {
        public  void main() {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the base of the triangle: ");
            double base = input.nextDouble();

            System.out.print("Enter the height of the triangle: ");
            double height = input.nextDouble();

            double area = 0.5 * base * height;

            System.out.printf("Area of the triangle = %.3f\n", area);

            // الشرط لتحديد حجم المثلث
            if (area >= 100) {
                System.out.println("The triangle is big.");
            } else {
                System.out.println("The triangle is small.");
            }

            input.close();
        }
    }


