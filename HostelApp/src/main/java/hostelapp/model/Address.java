package hostelapp.model;

public class Address {
    private String address;
    private String zipCode;
    private String city;
    private String state;

    public Address(){
        this("", "not provided", null);
    }

    public Address(String address, String zipCode, String state) {
        this.address = address;
        this.zipCode = zipCode;
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static void main(String[] args) {
        Address address = new Address();
        String logradouro = address.getAddress();
        String estado = address.getState();
        String cidade = address.getCity();
        String cep = address.getZipCode();

        System.out.println("Dados do endereço criado:");
        System.out.println(cidade + " " + estado + " " + logradouro +
                " " + cep);

        Address endereco2 =
                new Address("Rua Coronel Manoel Teixeira", "33678-000", "MG");

        endereco2.setCity("Alfenas");
        System.out.println("Dados do segundo endereço criado:");
        System.out.println(endereco2.getAddress() + " " + endereco2.getCity() +
                " " + endereco2.getState() + " " + endereco2.getZipCode());
    }
}
