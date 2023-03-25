package Classes;
import enums.Image;
import enums.Status;
import model.MyException;
import model.ProfileService;
import java.util.*;

public class ProfileServiceImpl implements ProfileService {

    List<Profile> profileList = new ArrayList<>();
    @Override
    public Profile installWhatsapp(List<Profile>profiles) {
        try {
            Profile newProfile = new Profile();
            System.out.print("Enter phone number: ");
            Scanner scanner1 = new Scanner(System.in);
            int number = scanner1.nextInt();
            newProfile.setPhoneNumber(number);
            System.out.print("Enter user name: ");
            Scanner scanner2 = new Scanner(System.in);
            String name = scanner2.nextLine();
            newProfile.setUserName(name);
            System.out.print("Enter password: ");
            Scanner scanner3 = new Scanner(System.in);
            String password = scanner3.nextLine();
                if (password.length() <= 7) {
                    System.out.println("Парольдун узундугу 7ге барабар же андан коп болуусу керек!!!");
                } else {
                    newProfile.setPassword(password);
                }
                newProfile.setId(profiles.size() + 1);
                newProfile.setStatuses(Status.HELLO_I_USE_WHATSAPP);
                newProfile.setImages(Image.DEFAULT_PHOTO);
                newProfile.setMessages("null");
                System.out.println(newProfile + "\nВы успешно зарегистровались!");
                return newProfile;


        } catch (InputMismatchException e) {
            System.out.println(e.getMessage() + " Write Only number ");
        }
        return null;
    }

    @Override
    public void goToProfile(List<Profile>profiles) {
        Profile newProfile = new Profile();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        System.out.print("Enter password: ");
        Scanner scanner1 = new Scanner(System.in);
        String password = scanner1.nextLine();
        for (Profile d : profiles) {
            if (d.getUserName().equals(name) && d.getPassword().equals(password)) {
                System.out.println(profileList.add(newProfile));
                profiles.add(d);
                System.out.println(d);
            }
            System.out.println(d);
        }
    }
    @Override
    public void getAllWhatsappStatus(List<Profile>profiles) {
        for(Status s : Status.values()){
            System.out.println(s.toString());
        }
    }

    @Override
    public void changeProfilePhoto(List<Profile>profiles) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Write name: ");
            String name = scanner.nextLine();
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Write password: ");
            String password = scanner1.nextLine();

            for(Profile p : profiles){
                if(p.getUserName().equals(name) && p.getPassword().equals(password)){
                    System.out.println("Киньте новую ссылку на фото: "+
                            "\n1. "+Image.DEFAULT_PHOTO+
                            "\n2. "+Image.YOUR_PHOTO+
                            "\n3. "+Image.VILLAGE_PHOTO+
                            "\n4. "+Image.LINK);

                    Scanner scanner2 = new Scanner(System.in);
                    int a = scanner2.nextInt();
                    switch (a){
                        case 1:
                            p.setImages(Image.valueOf(String.valueOf(Image.DEFAULT_PHOTO)));
                            break;
                        case 2:
                            p.setImages(Image.valueOf(String.valueOf(Image.YOUR_PHOTO)));
                            break;
                        case 3:
                            p.setImages(Image.valueOf(String.valueOf(Image.VILLAGE_PHOTO)));
                            break;
                        case 4:
                            p.setImages(Image.valueOf(String.valueOf(Image.LINK)));
                            break;
                        default:
                            System.out.println("Выбрать из списка!!!");
                    }
                    System.out.println(p);

                }else{
                    throw new MyException("неверный пароль или имя пользователя!");
                }
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void changeWhatsappStatus(List<Profile>profiles) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Write name: ");
            String name = scanner.nextLine();
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Write password: ");
            String password = scanner1.nextLine();

            for(Profile p : profiles){
                if(p.getUserName().equals(name) && p.getPassword().equals(password)){
                    System.out.println("Твой статус: "+ Status.HELLO_I_USE_WHATSAPP+
                            "\nВыбрать один из статусов"+
                            "\n1. "+Status.AT_WORK+
                            "\n2. "+Status.BUSY+
                            "\n3. "+Status.IN_GYM+
                            "\n4. "+Status.IN_TOUCH+
                            "\n5. "+Status.TO_THE_CINEMA+
                            "\n6. "+Status.HELLO_I_USE_WHATSAPP);

                    Scanner scanner2 = new Scanner(System.in);
                    int b = scanner2.nextInt();
                    switch (b){
                        case 1:
                            p.setStatuses(Status.AT_WORK);
                            break;
                        case 2:
                            p.setStatuses(Status.BUSY);
                            break;
                        case 3:
                            p.setStatuses(Status.IN_GYM);
                            break;
                        case 4:
                            p.setStatuses(Status.IN_TOUCH);
                            break;
                        case 5:
                            p.setStatuses(Status.TO_THE_CINEMA);
                            break;
                        case 6:
                            p.setStatuses(Status.HELLO_I_USE_WHATSAPP);
                        default:
                            System.out.println("Выбрать из списка!!!");
                    }
                    System.out.println(p);

                }else{
                    throw new MyException("неверный пароль или имя пользователя!");
                }
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void addContact(List<Profile>profiles) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Write name: ");
            String name = scanner.nextLine();
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Write password: ");
            String password = scanner1.nextLine();
            for (Profile p : profiles) {
                if (p.getUserName().equals(name) && p.getPassword().equals(password)) {
                    System.out.print("введите контактный номер ватсап: ");
                    int number = new Scanner(System.in).nextInt();
                    for(Profile d : profiles){
                        if(d.getPhoneNumber() == number){
                            System.out.println("Контакт успешно добавлена!!!");
                        }else{
                            System.out.println("этот номер не устанавливает WhatsApp");
                        }
                    }
                }else{
                    System.out.println("этот номер не устанавливает WhatsApp");
                }
            }
        }catch (Exception u){
            System.out.println(u.getMessage());
        }
    }
    @Override
    public void sendMessage(List<Profile>profiles) {
        System.out.println("Write your name ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Write your password");
        String password = new Scanner(System.in).nextLine();
        for (Profile p : profiles) {
            if (p.getUserName().equals(name) && p.getPassword().equals(password)) {
                System.out.println(" your contacts ");
                for (Profile a : p.getList()) {
                    System.out.println(a.getUserName());
                }
                System.out.println("Choose on of them");
                String message = new Scanner(System.in).nextLine();
                for (Profile d : p.getList()) {
                    if (d.getUserName().equals(message)) {
                        System.out.println(d.getMessages());
                    }
                }
                System.out.println("Enter message");
                String bb = new Scanner(System.in).nextLine();
                System.out.println("Do you want send (yes/no )?");
                String aa = new Scanner(System.in).nextLine();
                for (Profile pro : p.getList()) {
                    Map<String, String> map = new HashMap<>();
                    if (pro.getUserName().equals(message)) {
                        if (bb.contains("yes")) {
                            map.put(p.getUserName(), bb);
                            map.put(pro.getUserName(), bb);
                            p.setMessages(map.toString());
                            p.setMessages(map.toString());

                        } else if (aa.contains("no")) {
                            System.out.println("Your message was not sent !");
                        }
                        }
                    }

                }
            }

    }

    @Override
    public void deleteWhatsapp(List<Profile>profiles) {

    }
}
