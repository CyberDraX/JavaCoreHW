package JavaCoreHM3;

import java.util.Arrays;

public class QuadraticEquationSolver {

    public double[] solve(int a, int b, int c) {
        if (a == 0) {
            return  new double[0];
        }

        double dis = b * b - 4 * a * c;

        if (dis < 0) {
            return new double[0];
        } else if (dis == 0) {
            double x = -b / (2.0 * a);
            return  new double[] {x};
        } else {
            double sqrtD = Math.sqrt(dis);
            double x1 = (-b + sqrtD) / (2.0 * a);
            double x2 = (-b - sqrtD) / (2.0 * a);
            return x1 > x2 ? new double[] { x1, x2 } : new double[] { x2, x1 };
        }
    }

    public static void main(String[] args) {
        QuadraticEquationSolver solver = new QuadraticEquationSolver();

        System.out.println(Arrays.toString(solver.solve(1, -2, -3)));
        System.out.println(Arrays.toString(solver.solve(1, 12, 36)));
        System.out.println(Arrays.toString(solver.solve(5, 3, 7)));

    }
}