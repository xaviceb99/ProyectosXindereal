public class Pikachu extends Pokemon implements AtaqueEspecial {

    public Pikachu() {
        super("Pikachu");
    }


    @Override
    public void hacer(Pokemon objetivo) {
        System.out.println("¡El Imapactrueno hace daño a " + objetivo.getNombre() + "!");
    }

    @Override
    public void ataqueEspecial(Pokemon objetivo) {
        System.out.println(this.nombre + " Usa Impactrueno contra " + objetivo.getNombre() + "!");
        hacer(objetivo);
    }


}
