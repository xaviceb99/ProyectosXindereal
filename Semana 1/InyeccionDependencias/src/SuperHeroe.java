public class SuperHeroe {

    private String nombre;
    private Poderes poder;

    public SuperHeroe(String nombre, Poderes poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    public void combatirVillano(String villano) {
        System.out.println(nombre + " se une a la batalla ");
        poder.usarPoder(villano);
    }
}
