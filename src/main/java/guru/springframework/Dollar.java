package guru.springframework;

/**
 * Created by Mahlori Ngobeni on 2021/05/02
 */
public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier) {
        amount *= multiplier;
    }
}
