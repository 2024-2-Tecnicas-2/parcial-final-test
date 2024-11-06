package logicaNegocio;

public abstract class Animal {
    private TipoHabitat habitat;

    // Constructor
    public Animal(TipoHabitat habitat) {
        this.habitat = habitat;
    }

    // Método abstracto para emitir sonido
    public abstract String emitirSonido();

    // Método abstracto para obtener la dieta
    public abstract String obtenerDieta();

    // Método para obtener el hábitat del animal
    public TipoHabitat getHabitat() {
        return habitat;
    }
}
