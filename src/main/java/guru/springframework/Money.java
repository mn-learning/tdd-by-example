package guru.springframework;

/**
 * Created by Mahlori Ngobeni on 2021/05/23
 */
public class Money {

    protected int amount;

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
}
