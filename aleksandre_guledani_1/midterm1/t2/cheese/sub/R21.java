
package aleksandre_guledani_1.midterm1.t2.cheese.sub;

import aleksandre_guledani_1.midterm1.t2.cheese.A21;
import aleksandre_guledani_1.midterm1.t2.cup.aria.A22;

public class R21 {

    public static void main(String[] args) {
        // Create instances of A21 and A22
        A21 rectangle = new A21(10, 5); // Length 10, Width 5
        A22 month = new A22(3); // Month number 3 (March)

        // Print the area of the rectangle
        System.out.println("Area of rectangle: " + rectangle.getArea());

        // Print the name of the month
        System.out.println("Month: " + month.getMonthName());
    }
}
