public class Main {
    public static void main(String[] args) {

        String produtos[] = {"Arroz", "Feijão", "Açucar", "Café"};
        float preco[][] = {
                {15.88f, 16.99f},
                {10.67f, 13.99f},
                {13.90f, 14.88f},
                {16.00f, 10.99f}
        };

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Item: " + produtos[i]);
            for (int j = 0; j < preco[i].length; j++) {
                System.out.println("Preço " + (j+1) + ": " + preco[i][j]);
            }
        }

    }
}