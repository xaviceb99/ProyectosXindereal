public abstract class Pokemon {

    protected String nombre;

    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    public abstract void ataqueEspecial(Pokemon objetivo);

    public String getNombre() {
        return nombre;
    }


}
