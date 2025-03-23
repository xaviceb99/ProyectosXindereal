//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creando Pokémon
        Pokemon pikachu = new Pikachu();
        Pokemon bulbasaur = new Bulbasaur();
        Pokemon charmander = new Charmander();

        // Simulando una batalla
        pikachu.ataqueEspecial(bulbasaur);
        bulbasaur.ataqueEspecial(charmander);
        charmander.ataqueEspecial(pikachu);
    }
}