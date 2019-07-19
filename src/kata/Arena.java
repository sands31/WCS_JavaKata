public class Arena {

    public static String fight(Worm worm1, Worm worm2) {

        while (worm1.getLife() > 0 && worm2.getLife() > 0) {
            if (worm1.getLife() >= worm2.getLife()) {
                attack(worm1, worm2);
                if (worm2.getLife() > 0) {
                    attack(worm2, worm1);
                }
            } else {
                attack(worm2, worm1);
                if (worm1.getLife() > 0) {
                    attack(worm1, worm2);
                }
            }
        }

        return worm1.getLife() > 0 ? worm1.getName() : worm2.getName();
    }

    private static void attack(Worm worm1, Worm worm2) {
        worm2.setLife(worm2.getLife() - worm1.getAttack());
    }
}
