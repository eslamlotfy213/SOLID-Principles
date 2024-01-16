package Dependencyinversion.problems;

public class DeliverCompany {

    public  void sendProduct(Product product){


        // dh el problem      DeliverDriver deliverDriver = new DeliverDriver();
        DeliverDriver deliverDriver = new DeliverDriver();
        deliverDriver.deliverProduct(product);

    }





}
