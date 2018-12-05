public class Cat extends Animal {

    public Cat(int lengthRun,
               int lengthSwim,
               float heightJump,
               int lengthRunMaximum,
               int lengthSwimMaximum,
               float heightJumpMaximum) {
        super(lengthRun, lengthSwim, heightJump, lengthRunMaximum, lengthSwimMaximum, heightJumpMaximum);
    }

      /**
     * Метод - животное плывет
     * @param length длина динстанции
     * @return возвращает false
     */
    @Override
    public boolean canSwim(int length) {
        boolean canSwim = super.canSwim(length);
        if (!canSwim) {
            System.out.print("Кошки не умеют плавать ");
        }
        return canSwim;
    }

    @Override
    public void setLengthSwim(int lengthSwim) {
        super.setLengthSwim(0);
    }
}
