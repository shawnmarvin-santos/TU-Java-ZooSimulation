package zoo.repository;

import zoo.model.people.*;
import zoo.utils.ConsoleUtil;
import zoo.utils.MessageConstants;

import java.util.Map;
import java.util.Scanner;

public class AdminRepository {
    private static AdminRepository instance;
    private static final Scanner scanner = new Scanner(System.in);
    private ZooStaff zooStaff;
    private Map<String, Handler> handlerMap;
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
        if(checkIfStaffSetup()){
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

    public boolean checkIfStaffSetup(){
        boolean returnValue = true;
        if(!isStaffSetup) {
            returnValue = false;
            ConsoleUtil.printWaning(MessageConstants.ZOO_STAFF_IS_NOT_YET_SET_UP);
        }
        return !returnValue;
    }

    public void setupStaff(ZooStaff staff){
        zooStaff = staff;

        handlerMap = Map.of(
                zooStaff.getBirdHandler().getName().toLowerCase(), zooStaff.getBirdHandler(),
                zooStaff.getFelineHandler().getName().toLowerCase(), zooStaff.getFelineHandler(),
                zooStaff.getPachydermHandler().getName().toLowerCase(), zooStaff.getPachydermHandler()
        );

        isStaffSetup = true;
        ConsoleUtil.println(MessageConstants.STAFF_SETUP_SUCCESSFUL_MESSAGE);
    }

    public ZooStaff getZooStaff(){
        return zooStaff;
    }

    public Handler getHandler(String handlerName){
        Handler handler = handlerMap.get(handlerName.toLowerCase());
        if(null == handler){
            throw new IllegalArgumentException(MessageConstants.INVALID_HANDLER_NAME_ERROR);
        }
        return handler;
    }
}
