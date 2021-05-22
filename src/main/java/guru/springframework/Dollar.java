package guru.springframework;

/**
 * Created by Mahlori Ngobeni on 2021/05/02
 */
public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
