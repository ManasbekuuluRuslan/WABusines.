import Classes.Person;
import Classes.Profile;
import Classes.ProfileServiceImpl;
import model.MyException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
                ProfileServiceImpl profileService = new ProfileServiceImpl();
                List<Profile> profileList = new ArrayList<>();
                while (true) {

                    System.out.println("1 -> Install whatsapp\n" +
                        "2 -> Go to profile\n" +
                        "3 -> Get all whatsapp status\n" +
                        "4 -> Change profile photo\n" +
                        "5 -> Change whatsapp status\n" +
                        "6 -> Add contact\n" +
                        "7 -> Send message\n" +
                        "8 -> Delete whatsapp");
                int a = new Scanner(System.in).nextInt();
                switch (a) {
                    case 1:
                        System.out.println(profileService.installWhatsapp(profileList));
                        break;
                    case 2:
                        profileService.goToProfile(profileList);
                        break;
                    case 3:
                        profileService.getAllWhatsappStatus(profileList);
                        break;
                    case 4:
                        profileService.changeProfilePhoto(profileList);
                        break;
                    case 5:
                        profileService.changeWhatsappStatus(profileList);
                        break;
                    case 6:
                        profileService.addContact(profileList);
                        break;
                    case 7:
                        profileService.sendMessage(profileList);
                        break;
                    case 8:
                        profileService.deleteWhatsapp(profileList);
                        break;
                    default:
                        System.out.println("Выберите правильно!!!");
                }

            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}