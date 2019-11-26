package pl.coderslab.lambda;

public class IntegerFilter implements Filter<Integer> {
    @Override
    public boolean check(Integer integer) {
        return integer < 20;
    }
}
