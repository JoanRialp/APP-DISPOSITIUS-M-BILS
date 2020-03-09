package cat.udl.tidic.amb.myevents.Presenter;

import cat.udl.tidic.amb.myevents.Events;
import cat.udl.tidic.amb.myevents.Model.Persona;
import cat.udl.tidic.amb.myevents.UserViewActions;

public class User_Presenter {

    private Persona persona = new Persona();
    private UserViewActions view;


    public User_Presenter(UserViewActions view) {
         this.view = view;
    }

    public void setUserFullName(String fullName){
        this.persona.setFull_name(fullName);
    }

    public void setUserDescription(String description)
    {
        this.persona.setDescription(description);
    }

    public void showBio(){
        view.updateUI(this.persona.toString());
    }


}
