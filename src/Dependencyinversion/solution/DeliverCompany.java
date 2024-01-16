package Dependencyinversion.solution;

public class DeliverCompany {






    // dh el interface
    private  DeliverService deliverService;




    // dh el constructor
    public  DeliverCompany(DeliverService deliverService){
        this.deliverService = deliverService;
    }


    // dh el problem      DeliverDriver deliverDriver = new DeliverDriver();

    public  void sendProduct(Product product){
        this.deliverService.deliverProduct(product);

    }













}
