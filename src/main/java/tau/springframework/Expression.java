package tau.springframework;

public interface Expression {
    Money reduce(Bank bank, String to);
}
