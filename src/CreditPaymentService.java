public class CreditPaymentService {
    public double calculate (double a, double b, double c){
        double result;
               {
            double x;
            x =(1+b/100/12);

            double y;
                    y= Math.pow(x,-c);


                result = (a *(b/100/12)) / (1 -y);


        }
        return (int)result;

    }
}
