package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            if (i == index) {
                for (int j = i; j < products.length; j++) {
                    if (products[j] == products[products.length - 1]) {
                        products[products.length - 1] = null;
                        break;
                    }
                    products[j] = products[j + 1];
                }
                break;
            }
        }
        return products;
    }

}
