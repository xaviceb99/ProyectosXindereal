
public class Main {
    public static void main(String[] args) {
        SuperHeroe ironMan = InyectorDependencias.crearSuperheroe("Iron Man", "laser");
        SuperHeroe spiderMan = InyectorDependencias.crearSuperheroe("Spiderman", "telaraña");
        SuperHeroe Hulk = InyectorDependencias.crearSuperheroe("Hulk", "fuerza");


        String villano = "Thanos";

        ironMan.combatirVillano(villano);
        spiderMan.combatirVillano(villano);
        Hulk.combatirVillano(villano);
    }
}