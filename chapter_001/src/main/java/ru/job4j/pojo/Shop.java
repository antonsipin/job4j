package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        System.out.println('\n' + "Заменяем ячейку с индексом i на нулевую ссылку, а потом смещаем все элементы на одну позицию влево" + '\n');
        delete(products, 0);
    }

    public static Product[] delete(Product[] products, int i) {
        products[i] = null;
        for (int j = 0; j < products.length - 1; j++) {
            Product product = products[j];
            if (product == null && products[j + 1] != null) {
                product = products[j + 1];
                products[j + 1] = null;
                System.out.println(product.getName());
            } else {
                if (product != null) {
                    System.out.println(product.getName());
                } else {
                    System.out.println("null");
                }
            }
        }
        System.out.println(products[products.length - 1]);
        return products;
    }
}

