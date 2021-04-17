// use enum?

public enum Instruction {

    L(90),
    R(270),
    M(0);

    private final int n;

    Instruction(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }
}