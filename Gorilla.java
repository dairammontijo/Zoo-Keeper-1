class Gorilla extends Mammal {
    

    public void throwSomething() {
        this.energyLevel -= 5;
        System.out.println("Gorilla has thrown something");
    }

    public void eatBananas() {
        this.energyLevel += 10;
        System.out.println("*Gorilla happy noises*");
    }

    public void climb() {
        this.energyLevel -= 10;
        System.out.println("Gorilla has climbed a tree");
    }
}