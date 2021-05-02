package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Mahlori Ngobeni on 2021/05/02
 */
public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
