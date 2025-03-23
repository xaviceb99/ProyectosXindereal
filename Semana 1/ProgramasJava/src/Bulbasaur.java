public class Bulbasaur extends Pokemon implements AtaqueEspecial{
    public Bulbasaur() {
        super("Bulbasur");
    }

    @Override
    public void hacer(Pokemon objetivo) {
        System.out.println("¡Latigo Cepa hace daño a " + objetivo.getNombre()+ "!");

    }

    @Override
    public void ataqueEspecial(Pokemon objetivo) {
        System.out.println(this.nombre + " Usa Latigo cepa contra " + objetivo.getNombre());

        hacer(objetivo);
    }
}
