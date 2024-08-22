import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private String registration;

    public Employee(String name, String email, String registration) {
        super(name, email);
        this.registration = registration;
    }

    public Employee(){}

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    @Override
    public void getData(){
        System.out.println("Nome: " + getName() + "Email: " + getEmail() + "Matrícula: " + getRegistration());
    }
}
