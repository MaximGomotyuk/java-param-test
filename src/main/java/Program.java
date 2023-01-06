public class Program {
    int age;
    boolean result;
    public boolean checkIsAdult (int age) {
        this.age = age;
        if (this.age >= 18) {
            this.result = true;
        }
        else {
            this.result = false;
        }
        return this.result;
    }
}
