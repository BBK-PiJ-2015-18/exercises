class Spy {
    private static int spyCount;

    private int id;

    public Spy(int id) {
        Spy.spyCount++;
        this.id = id;

        System.out.println("Spy ID: " + this.id + " Count: " + this.spyCount);
    }

    public void die() {
        System.out.println("Spy " + this.id + " has been detected and eliminated");
        Spy.spyCount--;
        System.out.println("Number of spies: " + Spy.spyCount);
    }
}