package zoo.module;

import zoo.model.animal.Bird;
import zoo.model.animal.Feline;
import zoo.model.animal.Pachyderm;
import zoo.model.building.Hospital;
import zoo.model.people.Handler;
import zoo.model.people.Vendor;
import zoo.model.people.Veterinarian;
import zoo.model.people.Visitor;
import zoo.repository.AdminRepository;
import zoo.repository.AnimalRepository;
import zoo.utils.ConsoleUtil;
import zoo.utils.InputValidationUtil;
import zoo.utils.MessageConstants;

public class VisitorModule {
    private final AdminRepository adminRepository = AdminRepository.getInstance();
    private final AnimalRepository animalRepository = AnimalRepository.getInstance();

    private final Visitor visitor;

    public VisitorModule(Visitor visitor){
        this.visitor = visitor;
    }

    public void visitorMainMenu(){
        ConsoleUtil.println(MessageConstants.VISITOR_MAIN_MENU_BANNER);

        boolean inZoo = true;
        while (inZoo) {
            int option = InputValidationUtil.promptForOption(MessageConstants.CHOOSE_OPTION_PROMPT, 4);
            ConsoleUtil.println("");
            switch (option) {
                case 1:
                    visitEnclosure();
                    break;
                case 2:
                    visitShop();
                    break;
                case 3:
                    visitHospital();
                    break;
                case 4:
                    leaveZoo();
                    inZoo = false;
                    break;
                default:
                    break;
            }
        }
    }

    private void visitEnclosure(){
        ConsoleUtil.println(MessageConstants.VISITOR_VISIT_ENCLOSURE_BANNER);
        int option = InputValidationUtil.promptForOption(MessageConstants.CHOOSE_OPTION_PROMPT, 4);
        ConsoleUtil.println("");

        int feed = InputValidationUtil.promptForOption("Would you like to feed(Yes(1)/No(2): ",2);
        switch (option){
            case 1:
                Handler pachydermHandler = adminRepository.getZooStaff().getPachydermHandler();
                Pachyderm pachyderm = (Pachyderm) animalRepository.getAssignedAnimals(pachydermHandler).getFirst();
                visitor.goTo(pachydermHandler.getLocation());
                if (feed == 1) {
                    pachydermHandler.feed(pachyderm);
                }
                pachyderm.roam();
                pachyderm.makeSound();
                break;
            case 2:
                Handler felineHandler = adminRepository.getZooStaff().getFelineHandler();
                Feline feline = (Feline) animalRepository.getAssignedAnimals(felineHandler).getFirst();
                visitor.goTo(felineHandler.getLocation());
                if (feed == 1) {
                    felineHandler.feed(feline);
                }
                feline.roam();
                feline.makeSound();
                break;
            case 3:
                Handler birdHandler = adminRepository.getZooStaff().getBirdHandler();
                Bird bird = (Bird) animalRepository.getAssignedAnimals(birdHandler).getFirst();
                visitor.goTo(birdHandler.getLocation());
                if (feed == 1) {
                    birdHandler.feed(bird);
                }
                bird.roam();
                bird.makeSound();
                break;
        }

        ConsoleUtil.println("");
        ConsoleUtil.println(MessageConstants.WHAT_WOULD_YOU_LIKE_TO_DO_NEXT_MESSAGE);
    }

    //To Improve, but works
    private void visitShop(){
        Vendor vendor = adminRepository.getZooStaff().getShopVendorOnDuty();
        visitor.goTo(vendor.getLocation());

        vendor.Sell();

        ConsoleUtil.println(MessageConstants.WHAT_WOULD_YOU_LIKE_TO_DO_NEXT_MESSAGE);
    }

    private void visitHospital(){
        HospitalModule hospitalModule = new HospitalModule();
        visitor.goTo(AdminRepository.getInstance().getZooStaff().getVeterinarianOnDuty().getLocation());
        hospitalModule.start();
        ConsoleUtil.println(MessageConstants.WHAT_WOULD_YOU_LIKE_TO_DO_NEXT_MESSAGE);
    }

    private void leaveZoo(){
        ConsoleUtil.println(MessageConstants.THANK_YOU_FOR_VISITING_MESSAGE);
    }
}
