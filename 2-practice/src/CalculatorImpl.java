import java.rmi.RemoteException;
import java.util.ArrayList;

public class CalculatorImpl implements Calculator {

    @Override
    public double [] calculate(int a, int b, int c) throws RemoteException {

        double d = b * b - 4 * a * c;
        double x1 = ( -b - Math.sqrt(d) ) / ( 2 * a );
        double x2 = ( -b + Math.sqrt(d) ) / ( 2 * a );

        ArrayList<Double> xArray = new ArrayList<>();
        xArray.add(x1);
        if (x1 != x2)
            xArray.add(x2);

        return xArray.stream().mapToDouble(Double::doubleValue).toArray();
    }
}
