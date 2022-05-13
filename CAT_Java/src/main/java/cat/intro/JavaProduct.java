package cat.intro;


import io.vavr.control.Either;

public class JavaProduct <A, B> {
    private A first;
    private B second;

    public JavaProduct(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
