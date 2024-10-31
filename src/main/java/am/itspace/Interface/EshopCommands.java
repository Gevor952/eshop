package am.itspace.Interface;

public interface EshopCommands {
    final String EXIT = "0";
    final String ADD_CATEGORY = "1";
    final String EDIT_CATEGORY_BY_ID = "2";
    final String DELETE_CATEGORY_BY_ID = "3";
    final String ADD_PRODUCT = "4";
    final String EDIT_PRODUCT_BY_ID = "5";
    final String DELETE_PRODUCT_BY_ID = "6";
    final String PRINT_SUM_OF_PRODUCTS = "7";
    final String PRINT_MAX_OF_PRICE_PRODUCT = "8";
    final String PRINT_MIN_OF_PRICE_PRODUCT = "9";
    final String PRINT_AVG_OF_PRICE_PRODUCT = "10";

    static void eshopCommands() {
        System.out.println("Please input " + EXIT + " from EXIT");
        System.out.println("Please input " + ADD_CATEGORY + " from ADD_CATEGORY");
        System.out.println("Please input " + EDIT_CATEGORY_BY_ID + " from EDIT_CATEGORY_BY_ID");
        System.out.println("Please input " + DELETE_CATEGORY_BY_ID + " from DELETE_CATEGORY_BY_ID");
        System.out.println("Please input " + ADD_PRODUCT + " from ADD_PRODUCT");
        System.out.println("Please input " + EDIT_PRODUCT_BY_ID + " from EDIT_PRODUCT_BY_ID");
        System.out.println("Please input " + DELETE_PRODUCT_BY_ID + " from DELETE_PRODUCT_BY_ID");
        System.out.println("Please input " + PRINT_SUM_OF_PRODUCTS + " from PRINT_SUM_OF_PRODUCTS");
        System.out.println("Please input " + PRINT_MAX_OF_PRICE_PRODUCT + " from PRINT_MAX_OF_PRICE_PRODUCT");
        System.out.println("Please input " + PRINT_MIN_OF_PRICE_PRODUCT + " from PRINT_MIN_OF_PRICE_PRODUCT");
        System.out.println("Please input " + PRINT_AVG_OF_PRICE_PRODUCT + " from PRINT_AVG_OF_PRICE_PRODUCT");
    }


}
