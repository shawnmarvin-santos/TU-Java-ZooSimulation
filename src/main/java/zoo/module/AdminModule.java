package zoo.module;

import zoo.model.building.Shop;
import zoo.model.building.enclosure.BirdEnclosure;
import zoo.model.building.enclosure.FelineEnclosure;
import zoo.model.building.enclosure.PachydermEnclosure;
import zoo.model.people.*;
import zoo.repository.AdminRepository;
import zoo.repository.AnimalRepository;
import zoo.utils.ConsoleUtil;
import zoo.utils.InputValidationUtil;
import zoo.utils.MessageConstants;

public class AdminModule {

    public void start() {
        if (!login()) {
            ConsoleUtil.printError(MessageConstants.LOGIN_UNSUCCESSFUL_LIMIT_REACHED);
            return;
        }
        AnimalRepository.getInstance().instantiateAnimals();
        openMainMenu();
    }

    private boolean login() {
        ConsoleUtil.println(MessageConstants.WELCOME_BANNER_MESSAGE);
        for (int i =0; i < 3; i++){
            String username = InputValidationUtil.promptForString(MessageConstants.LOGIN_USERNAME_PROMPT);
            String password = InputValidationUtil.promptForString(MessageConstants.LOGIN_PASSWORD_PROMPT);

            if (AdminRepository.getInstance().isAuthorized(username, password)) {
                ConsoleUtil.println(MessageConstants.LOGIN_SUCCESSFUL_MESSAGE);
                return true;
            } else {
                ConsoleUtil.println(MessageConstants.LOGIN_UNSUCCESSFUL_ERROR_MESSAGE);
            }
        }
        return false;
    }

    private void openMainMenu() {
        AdminRepository adminRepository = AdminRepository.getInstance();

        while (true) {
            ConsoleUtil.println(MessageConstants.ADMIN_MAIN_MENU_BANNER);

            int choice = InputValidationUtil.promptForOption(MessageConstants.CHOOSE_OPTION_PROMPT, 5);

            switch (choice) {
                case 1:
                    setupZooStaff();
                    break;
                case 2:
                    accessHandlerModule();
                    break;
                case 3:
                    adminRepository.openZoo();
                    accessTicketModule();
                    break;
                case 4:
                    adminRepository.closeZoo();
                    break;
                case 5:
                    ConsoleUtil.println(MessageConstants.THANK_YOU_FOR_VISITING_MESSAGE);
                    return;
            }
        }
    }

    private void setupZooStaff() {
        ConsoleUtil.println(MessageConstants.ZOO_SETUP_BANNER);

        String manager = InputValidationUtil.promptForString(MessageConstants.ENTER_MANAGER_PROMPT);
        String vet = InputValidationUtil.promptForString(MessageConstants.ENTER_VETERINARIAN_PROMPT);
        String pachydermHandler = InputValidationUtil.promptForString(MessageConstants.ENTER_PACHYDERM_HANDLER_PROMPT);
        String felineHandler = InputValidationUtil.promptForString(MessageConstants.ENTER_FELINE_HANDLER_PROMPT);
        String birdHandler = InputValidationUtil.promptForString(MessageConstants.ENTER_BIRD_HANDLER_PROMPT);
        String ticketVendor = InputValidationUtil.promptForString(MessageConstants.ENTER_TICKET_PROMPT);
        String shopVendor = InputValidationUtil.promptForString(MessageConstants.ENTER_SHOP_PROMPT);

        ZooStaff staff = new ZooStaff(new Veterinarian(vet),
                new Vendor(shopVendor,new Shop()),
                new Vendor(ticketVendor, new Shop()),
                new Manager(manager),
                new Handler(pachydermHandler, new PachydermEnclosure()),
                new Handler(birdHandler, new BirdEnclosure()),
                new Handler(felineHandler, new FelineEnclosure())
        );
        AdminRepository.getInstance().setupStaff(staff);
    }

    private void accessTicketModule() {
        TicketModule ticketModule = new TicketModule();
        ticketModule.ticketMainMenu();
    }

    private void accessHandlerModule() {
        if(!AdminRepository.getInstance().checkIfStaffSetup()){
            return;
        }

        String handlerName = InputValidationUtil.promptForString(MessageConstants.ENTER_HANDLER_PROMPT);

        try{
            Handler handler = AdminRepository.getInstance().getHandler(handlerName);
            HandlerModule handlerModule = new HandlerModule(handler);
            handlerModule.start();
        } catch (IllegalArgumentException e){
            ConsoleUtil.printError(e.getMessage());
        }
    }
}
