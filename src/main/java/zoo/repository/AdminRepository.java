package zoo.repository;

import zoo.model.animal.Animal;
import zoo.model.people.*;
import zoo.utils.ConsoleUtil;
import zoo.utils.MessageConstants;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminRepository {
    private static AdminRepository instance;
    private static final Scanner scanner = new Scanner(System.in);
    private ZooStaff zooStaff;
    private boolean isZooOpen;
    private boolean isStaffSetup;

    final String ADMIN_USERNAME = "admin";
    final String ADMIN_PASSWORD = "adminadmin";

    private AdminRepository(){}

    public static AdminRepository getInstance(){
        if(instance == null){
            instance = new AdminRepository();
        }
        return instance;
    }

    public boolean isAuthorized(String inputUsername, String inputPassword){
        return inputUsername.equals(ADMIN_USERNAME) && inputPassword.equals(ADMIN_PASSWORD);
    }

    public Scanner getScanner(){
        return scanner;
    }

    public void openZoo(){
        if(!isStaffSetup){
            ConsoleUtil.printWaning(MessageConstants.ZOO_STAFF_IS_NOT_YET_SET_UP);
            return;
        }
        if(!isZooOpen){
            isZooOpen = true;
        } else {
            ConsoleUtil.printWaning(MessageConstants.ZOO_IS_ALREADY_OPEN_WARNING);
        }
    }

    public void closeZoo(){
        if(isZooOpen){
            isZooOpen = false;
        } else {
            ConsoleUtil.printWaning(MessageConstants.ZOO_IS_NOT_OPEN_WARNING);
        }
    }

    public void setupStaff(ZooStaff staff){
        zooStaff = staff;
        isStaffSetup = true;
        ConsoleUtil.println(MessageConstants.STAFF_SETUP_SUCCESSFUL_MESSAGE);
    }

    public ZooStaff getZooStaff(){
        return zooStaff;
    }
}
