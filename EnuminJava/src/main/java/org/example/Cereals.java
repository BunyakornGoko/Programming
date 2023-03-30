package org.example;

public enum Cereals {
    COCOA_PUFFS(50),
    FROOT_LOOPS(80),
    CAPATAIN_CRUNCH(70),
    CONFLEX(100);
    int levelOfDeliciousness;

    Cereals(int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }
}
