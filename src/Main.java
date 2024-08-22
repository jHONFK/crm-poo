public class Main {
    public static void main(String[] args) {
        CRM crm = new CRM();

        Client client = new Client("Claudio Rocha", "claudio@gmail.com", "00923463018");

        Employee employee = new Employee("Emilyn Bosquerolli", "emilyn@gmail.com", "12345611019");

        Product product = new Product("Notebook", 2566.99);
        Product product2 = new Product("Teclado", 657.78);

        Purchase purchase = new Purchase(001, client, employee);
        purchase.addProduct(product);
        purchase.addProduct(product2);

        crm.addClient(client);

        crm.addEmployee(employee);

        crm.addProduct(product);
        crm.addProduct(product2);

        crm.addPurchase(purchase);

        purchase.getInfos();

        crm.saveData();

        CRM crm2 = new CRM();
        crm2.loadData();
        if(!crm2.getPurchases().isEmpty()){
            crm2.getPurchases().get(0).getInfos();
        }

    }
}