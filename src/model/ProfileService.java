package model;

import Classes.Profile;

import java.util.List;

public interface ProfileService {
     Profile installWhatsapp(List<Profile>profiles);
     void goToProfile(List<Profile>profiles) throws MyException;
     void getAllWhatsappStatus(List<Profile>profiles);
     void changeProfilePhoto(List<Profile>profiles);
     void changeWhatsappStatus(List<Profile>profiles);
     void addContact(List<Profile>profiles);
     void sendMessage(List<Profile>profiles);
     void deleteWhatsapp(List<Profile>profiles);
}
