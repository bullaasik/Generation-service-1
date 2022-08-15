package bednova.generator.DTO;
import java.time.Instant;
import java.time.LocalTime;

public enum CurrencyPairsChange {
    USDRUB,
    EURRUB,
    EURUSD;

    public double getValueOfCurrencyPair() {
        double MyConst = 5 + Math.cos(Math.random());
        double Timer = LocalTime.now().getSecond() % 2 == 0 ? 1.1 : 0.9;
        double ValueOfCurrencyPair = 1;

        if (this == USDRUB) {
            ValueOfCurrencyPair = 60.83 * Timer + MyConst;
        } else if (this == EURRUB) {
            ValueOfCurrencyPair = 62.47 * Timer + MyConst;
        } else if (this == EURUSD) {
            ValueOfCurrencyPair = 1.05 * Timer + MyConst;
        }
        return ValueOfCurrencyPair;
    }

    public long getId() {
        long id = 0;
        long constanta = Instant.now().getEpochSecond();
        if (this == USDRUB) {
            id = constanta;
        }
        else if (this == EURRUB) {
            id = (long) (1.45 * constanta);
        }
        else if (this == EURUSD) {
            id = (long) (2.7 * constanta);
        }
        return id;
    }
}
