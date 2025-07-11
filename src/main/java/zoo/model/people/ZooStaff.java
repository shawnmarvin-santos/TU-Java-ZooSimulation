package zoo.model.people;

public class ZooStaff {
    private Veterinarian vetOnDuty;
    private Vendor shopVendorOnDuty;
    private Vendor ticketVendorOnDuty;
    private Manager managerOnDuty;
    private Handler pachydermHandler;
    private Handler birdHandler;
    private Handler felineHandler;

    public ZooStaff() { }

    public ZooStaff(Veterinarian vetOnDuty,
                    Vendor shopVendorOnDuty,
                    Vendor ticketVendorOnDuty,
                    Manager managerOnDuty,
                    Handler pachydermHandler,
                    Handler birdHandler,
                    Handler felineHandler) {

        this.vetOnDuty = vetOnDuty;
        this.shopVendorOnDuty = shopVendorOnDuty;
        this.ticketVendorOnDuty = ticketVendorOnDuty;
        this.managerOnDuty = managerOnDuty;
        this.pachydermHandler = pachydermHandler;
        this.birdHandler = birdHandler;
        this.felineHandler = felineHandler;
    }

    public Vendor getShopVendorOnDuty() {
        return shopVendorOnDuty;
    }

    public Vendor getTicketVendorOnDuty() {
        return ticketVendorOnDuty;
    }

    public Manager getManagerOnDuty() {
        return managerOnDuty;
    }

    public Handler getPachydermHandler() {
        return pachydermHandler;
    }

    public Handler getBirdHandler() {
        return birdHandler;
    }

    public Handler getFelineHandler() {
        return felineHandler;
    }

    public Veterinarian getVeterinarianOnDuty(){
        return vetOnDuty;
    }

}
