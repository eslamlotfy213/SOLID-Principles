package Interfacesegregation.solution;

public class Freeparking implements Paidlot{

    @Override
    public double calculateFee(double car) {
        return 0;
    }

    @Override
    public void doPayments(double car) {

    }


}
