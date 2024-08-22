import java.io.Serializable;

public class Client extends Person implements Serializable {
    private String cpf;

    public Client(String name, String email, String cpf) {
        super(name, email);
        this.cpf = cpf;
    }

    public Client(){}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void getData(){
        System.out.println("Nome: " + getName() + "Email: " + getEmail() + "CPF: " + getCpf());
    }
}
