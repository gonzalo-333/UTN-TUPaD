class Animal {
    protected String especie;
    
    public Animal(String especie) {
        this.especie = especie;
    }
    
    public void describirAnimal() {
        System.out.print("Especie: " + this.especie + " -> ");
    }
    
    public void hacerSonido() {
        System.out.println("Sonido genérico...");
    }
}