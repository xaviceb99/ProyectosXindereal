public class InyectorDependencias {

    public static SuperHeroe crearSuperheroe(String nombre, String tipoPoder) {
        Poderes poder;
        switch (tipoPoder.toLowerCase()) {
            case "laser":
                poder = new RayoLaser();
                break;
            case "fuerza":
                poder = new SuperFuerza();
                break;
            case "telaraña":
                poder = new Telaraña();
                break;
            default:
                throw new IllegalArgumentException("Poder no reconocido");
        }
        return new SuperHeroe(nombre, poder);
    }
}
