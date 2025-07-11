package zoo.model.people;

public class ZooStaff {
    private Veterinarian vetOnDuty;
    private Vendor shopVendorOnDuty;
    private Vendor ticketVendorOnDuty;
    private Manager managerOnDuty;
    private Handler pachydermHandler;
    private Handler birdHandler;
    private Handler felinemHandler;

    public ZooStaff() { }

    public ZooStaff(Veterinarian vetOnDuty,
                    Vendor shopVendorOnDuty,
                    Vendor ticketVendorOnDuty,
                    Manager managerOnDuty,
                    Handler pachydermHandler,
                    Handler birdHandler,
                    Handler felinemHandler) {

        this.vetOnDuty = vetOnDuty;
        this.shopVendorOnDuty = shopVendorOnDuty;
        this.ticketVendorOnDuty = ticketVendorOnDuty;
        this.managerOnDuty = managerOnDuty;
        this.pachydermHandler = pachydermHandler;
        this.birdHandler = birdHandler;
        this.felinemHandler = felinemHandler;
    }

    public Veterinarian getVeterinarianOnDuty(){
        return vetOnDuty;
    }

    public Vendor getShopVendorOnDuty(){
        return shopVendorOnDuty;
    }
}
