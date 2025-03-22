public class Calculator {
    private float number1;
    private float number2;

    public float getNumber1() {
        return this.number1;
    }

    public float getNumber2() {
        return this.number2;
    }

    public void setNumber1(float number) {
        this.number1 = number;
    }

    public void setNumber2(float number) {
        this.number2 = number;
    }

    public float sum() {
        return this.number1 + this.number2;
    }

    public float sub() {
        return this.number1 - this.number2;
    }

    public float multiplication() {
        return this.number1 * this.number2;
    }

    public float division() {
        int result = (int) this.number1 / (int)this.number2;
        return (float) result;
    }

    public float pow() {
        return (float) Math.pow((double) this.number1, (double) this.number2);
    }

    public float sqrt() {
        return (float) Math.sqrt(((double)this.number1));
    }
}