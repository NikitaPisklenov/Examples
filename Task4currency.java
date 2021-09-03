package GroupProjects;

public class Task4currency {

    public static void main(String[] args) {

        double givenAmountUSD = 89;
        double givenAmountRUB = 10_000;

        double USDtoRUBcoefficient= 74.28;
        double RUBtoUSDcoefficient = 0.013;

        double convertedUSDtoRUB = givenAmountUSD*USDtoRUBcoefficient;
        double convertedRUBtoUSD = givenAmountRUB*RUBtoUSDcoefficient;

        System.out.println(convertedUSDtoRUB);

    }
}
