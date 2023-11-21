package Enum;

public enum Cereals {
    CAPTAIN_CRUNCH(13),
    FROOT_LOOPS(43),
    REESES_PUFFS(32),
    COCOA_PUFFS(23);

    final int del;
    final int rate = 43;

    Cereals(int del/* int rate*/) {
        this.del = del;
//        this.rate = rate;
    }
}
