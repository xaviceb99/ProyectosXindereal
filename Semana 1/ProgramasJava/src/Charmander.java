public class Charmander extends Pokemon implements AtaqueEspecial {
    public Charmander() {
        super("Charmader");
    }

    @Override
    public void hacer(Pokemon objetivo) {
        System.out.println("¡Llamarada hace daño a "+ objetivo.getNombre() + "!");

    }

    @Override
    public void ataqueEspecial(Pokemon objetivo) {
        System.out.println(this.nombre + " Uso Llamarada contra " + objetivo.getNombre());
        hacer(objetivo);

    }
}
