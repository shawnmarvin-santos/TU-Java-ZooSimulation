package zoo.module;

import zoo.repository.AdminRepository;
import zoo.utils.InputValidationUtil;
import zoo.utils.MessageConstants;

public class AdminModule {
    public void start() {
        if (!login()) {
            System.out.println("Login failed. Exiting admin module.");
            return;
        }

        login();
    }

    private boolean login() {
        System.out.println("\n=== Zoo Admin Console ===");
        String username = InputValidationUtil.promptForString(MessageConstants.LOGIN_USERNAME_PROMPT);
        String password = InputValidationUtil.promptForString(MessageConstants.LOGIN_PASSWORD_PROMPT);

        if (AdminRepository.getInstance().isAuthorized(username, password)) {
            System.out.println("\nLogin successful. Welcome!");
            return true;
        }
        return false;
    }

}
