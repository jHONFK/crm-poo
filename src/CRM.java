import java.util.ArrayList;
import java.util.List;

public class CRM {
    private List<Client> clients;
    private List<Employee> employees;
    private List<Product> products;
    private List<Purchase> purchases;
    private IFilePersistence filePersistence;

    public CRM() {
        this.clients = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.products = new ArrayList<>();
        this.purchases = new ArrayList<>();
        this.filePersistence = new FilePersistence();
    }


    public void addClient(Client client){
        this.clients.add(client);
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void addPurchase(Purchase purchase){
        this.purchases.add(purchase);
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void saveData(){
        filePersistence.saveData("clients.dat", clients);
        filePersistence.saveData("employees.dat", employees);
        filePersistence.saveData("products.dat", products);
        filePersistence.saveData("purchases.dat", purchases);
    }

    public void loadData(){
        this.clients = (List<Client>) filePersistence.loadData("clients.dat");
        this.employees = (List<Employee>) filePersistence.loadData("employees.dat");
        this.products = (List<Product>) filePersistence.loadData("products.dat");
        this.purchases = (List<Purchase>) filePersistence.loadData("purchases.dat");
    }


}
