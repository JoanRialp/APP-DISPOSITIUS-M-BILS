package cat.udl.tidic.amb.myevents.Model;

import androidx.annotation.NonNull;

public class Persona {

    private String full_name;
    private String description;


    public Persona(String full_name, String description) {
        this.full_name = full_name;
        this.description = description;
    }

    public Persona(){
        this.full_name="";
        this.description="";
    }

    @NonNull
    @Override
    public String toString(){
        return "Hola "+ full_name + ", te has creado con exito: " + description;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
