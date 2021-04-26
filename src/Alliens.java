public class Alliens implements Characters {
    private int power=100;

    @Override
    public void jump() {
        System.out.println("Alien is jumping");
    }

    @Override
    public void defend() {
        System.out.println("Alien defended the attack");
    }

    @Override
    public void speak() {
        System.out.println("Alien is speaking");
    }

    @Override
    public void attack() {
        System.out.println("Alien attack");
         power= power - 5;
        System.out.println("Health= " + power);
    }
}
