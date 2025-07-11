package zoo.repository;

import zoo.model.animal.Animal;
import zoo.model.building.Building;
import zoo.model.people.*;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminRepository {
    private static AdminRepository instance;

    private static Scanner scanner = new Scanner(System.in);

    private final String adminUsername = "admin";
    private final String adminPassword = "adminadmin";

    private boolean isZooOpen;

    private AdminRepository(){}

    public static AdminRepository getInstance(){
        if(instance == null){
            instance = new AdminRepository();
        }
        return instance;
    }

    public boolean isAuthorized(String inputUsername, String inputPassword){
        boolean inputValid = false;
        if(inputUsername.equals(adminUsername) && inputPassword.equals(adminPassword)){
            inputValid = true;
        }
        return inputValid;
    }

    public Scanner getScanner(){
        return scanner;
    }
}
