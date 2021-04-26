public class Warriors extends Human implements Characters {
    private static int power = 100;

    @Override
    public void jump() {
        System.out.println("Warrior is jumping");
    }

    @Override
    public void defend() {
        System.out.println("Warrior defended the attack");
    }

    @Override
    public void speak() {
        System.out.println("Warriors is speaking");
    }

    @Override
    public void attack() {

        if (power <= 0 || power > 100) {
            throw new ArithmeticException("Character is Wasted");
        }
        else {
            System.out.println("Warriors Are Attacking By Swords");
            power=power-20;
            System.out.println("Health: "+power);
        }
    }

    @Override
    public void explore() {
        System.out.println("Warriors Are Exploring");
    }

    public void capture() {
        System.out.println("Warriors Are Capturing");
    }
}
