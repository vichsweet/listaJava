public class Controller {

    private final double DOLLAR_CONVERSION_FACTOR = 0.19;
    private final double EURO_CONVERSION_FACTOR = 0.16;
    private final double LIBRA_CONVERSION_FACTOR = 0.13;

    double convertToDollar(double value) {
        return value * DOLLAR_CONVERSION_FACTOR;
    }

    double convertToEuro(double value) {
        return value * EURO_CONVERSION_FACTOR;
    }

    double convertToLibra(double value) {
        return value * LIBRA_CONVERSION_FACTOR;
    }
}
