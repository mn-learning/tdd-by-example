package guru.springframework;

/**
 * Created by Mahlori Ngobeni on 2021/05/23
 */
public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
