public abstract class Animal {

    protected int lengthRun; //длина динстанции прибеге
    protected int lengthSwim; //длина дистанции при плавании
    protected float heightJump; //высота препятствия при прыжке
    protected int lengthRunMaximum;
    protected int lengthSwimMaximum;
    protected float heightJumpMaximum;

    /**
     * Конструктор
     * @param lengthRun длина динстанции прибеге
     * @param lengthSwim длина дистанции при плавании
     * @param heightJump высота препятствия при прыжке
     */
    public Animal(int lengthRun,
                  int lengthSwim,
                  float heightJump,
                  int lengthRunMaximum,
                  int lengthSwimMaximum,
                  float heightJumpMaximum) {
        this.lengthRun = lengthRun;
        this.lengthSwim = lengthSwim;
        this.heightJump = heightJump;
        this.lengthRunMaximum = lengthRunMaximum;
        this.lengthSwimMaximum = lengthSwimMaximum;
        this.heightJumpMaximum = heightJumpMaximum;
    }

    public Animal() {
        this.lengthRun = 0;
        this.lengthSwim = 0;
        this.heightJump = 0;
        this.lengthRunMaximum = 0;
        this.lengthSwimMaximum = 0;
        this.heightJumpMaximum = 0;
    }

    /**
     * Метод - животное бежит
     * @param lengthRun длина динстанции
     */
    public boolean canRun(int lengthRun) {
        return lengthRun <= lengthRunMaximum;
    }

    /**
     * Метод - животное плывет
     * @param lengthSwim длина динстанции
     */
    public boolean canSwim(int lengthSwim) {
        if (lengthSwimMaximum <= 0) {
            return false;
        }
        return lengthSwim <= lengthSwimMaximum;
    }

    /**
     * Метод - животное прыгает
     * @param heightJump высота препятствия
     */
    public boolean canJump(float heightJump){
        return heightJump <= heightJumpMaximum;
    }

    // -----------------------

    public int getLengthRun() {
        return lengthRun;
    }

    public void setLengthRun(int lengthRun) {
        if (lengthRun < 0) {
            this.lengthRun = 0;
        } else {
            this.lengthRun = lengthRun;
        }
    }

    public int getLengthSwim() {
        return lengthSwim;
    }

    public void setLengthSwim(int lengthSwim) {
        if (lengthSwim < 0) {
            this.lengthSwim = 0;
        } else {
            this.lengthSwim = lengthSwim;
        }
    }

    public float getHeightJump() {
        return heightJump;
    }

    public void setHeightJump(float heightJump) {
        this.heightJump = heightJump < 0 ? 0 : heightJump;
    }

    public int getLengthRunMaximum() {
        return lengthRunMaximum;
    }

    public void setLengthRunMaximum(int lengthRunMaximum) {
        this.lengthRunMaximum = lengthRunMaximum;
    }

    public int getLengthSwimMaximum() {
        return lengthSwimMaximum;
    }

    public void setLengthSwimMaximum(int lengthSwimMaximum) {
        this.lengthSwimMaximum = lengthSwimMaximum;
    }

    public float getHeightJumpMaximum() {
        return heightJumpMaximum;
    }

    public void setHeightJumpMaximum(float heightJumpMaximum) {
        this.heightJumpMaximum = heightJumpMaximum;
    }
}
