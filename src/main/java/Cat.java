public class Cat extends Animal implements IPet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String greeting() {
        return "Miau mIAU";
    }
    @Override
    public boolean purr() {
        return true;
    }

    @Override
    public boolean roll() {
        return false;
    }

    @Override
    public String sayLoveYourMaster(String masterName) {
        return String.format("I love my master %s", masterName);
    }
}

