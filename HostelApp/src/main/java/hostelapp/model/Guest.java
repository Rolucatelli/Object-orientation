package hostelapp.model;

public class Guest {
    private String name;
    private String lastName;

    private Address address;

    public Guest(){
        this(null);
    }

    public Guest(String name){
        this(name, null);
    }

    public Guest(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Guest florentino = new Guest();
        Guest fermina = new Guest("Fermina");
        Guest gregorio = new Guest("Gregor", "Samsa");

        System.out.println("Dados do hospede..." + florentino.getName() + " "
                + florentino.getLastName());

        System.out.println("Dados do hospede..." + fermina.getName()+ " "
                + fermina.getLastName());

        System.out.println("Dados do hospede..." + gregorio.getName() + " "
                + gregorio.getLastName());

        Address endereco =
                new Address("Rua Coronel Manoel Teixeira", "33678-000", "MG");

        endereco.setCity("Alfenas");

        gregorio.setAddress(endereco);

        System.out.println("Dados do hospede..." + gregorio.getName() + " "
                + gregorio.getLastName() + " " + gregorio.getAddress().getCity());

    }
}
