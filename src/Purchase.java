import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Purchase implements Serializable {
    private int code;
    private Client client;
    private List<Product> products;
    private Employee employee;

    public Purchase(int code, Client client, Employee employee) {
        this.code = code;
        this.client = client;
        this.employee = employee;
        this.products = new ArrayList<>();
    }

    public Purchase(){
        this.products = new ArrayList<>();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public double totalValue(){
        double total = 0;
        for(Product product : this.products){
            total += product.getPrice();
        }
        return total;
    }

    public void getInfos(){
        System.out.println("Codigo do pedido: " + code);
        System.out.println("Funcionario responsavel pela venda: " + getEmployee().getName());
        for(Product product : this.products){
            System.out.println("Produto: " + product.getName());
            System.out.println("Preço do produto: " + product.getPrice());
        }
        System.out.println("Total da venda: " + totalValue());
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
