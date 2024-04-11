import hostelapp.model.Guest;

public class GuestTest {
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

    }
}
