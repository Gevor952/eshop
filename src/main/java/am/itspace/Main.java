package am.itspace;

import am.itspace.Interface.EshopCommands;
import am.itspace.model.Category;
import am.itspace.model.Product;
import am.itspace.storage.CategoryService;
import am.itspace.storage.ProductService;

import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ProductService productService = new ProductService();
    static CategoryService categoryService = new CategoryService();

    public static void main(String[] args) {
        start();

    }

    private static void start() {
        boolean run = true;
        while (run) {
            EshopCommands.eshopCommands();
            switch (scanner.nextLine()) {
                case EshopCommands.EXIT:
                    run = false;
                    break;
                case EshopCommands.ADD_CATEGORY:
                    addCategory();
                    break;
                case EshopCommands.EDIT_CATEGORY_BY_ID:
                    editCategoryById();
                    break;
                case EshopCommands.DELETE_CATEGORY_BY_ID:
                    deleteCategoryById();
                    break;
                case EshopCommands.ADD_PRODUCT:
                    addProduct();
                    break;
                case EshopCommands.EDIT_PRODUCT_BY_ID:
                    editProductById();
                    break;
                case EshopCommands.DELETE_PRODUCT_BY_ID:
                    deleteProductById();
                    break;
                case EshopCommands.PRINT_SUM_OF_PRODUCTS:
                    printSumOfProducts();
                    break;
                case EshopCommands.PRINT_MAX_OF_PRICE_PRODUCT:
                    printMaxOfPriceProduct();
                case EshopCommands.PRINT_MIN_OF_PRICE_PRODUCT:
                    printMinOfPriceProduct();
                case EshopCommands.PRINT_AVG_OF_PRICE_PRODUCT:
                    printAvgOfPriceProduct();
                default:
                    System.out.println("Invalid command");
            }

        }
    }

    private static void printAvgOfPriceProduct() {
        productService.printAvgOfPriceProduct();
    }

    private static void printMinOfPriceProduct() {
        productService.printMinOfPriceProduct();
    }

    private static void printMaxOfPriceProduct() {
        productService.printMaxOfPriceProduct();
    }

    private static void printSumOfProducts() {
        productService.printSumOfProducts();
    }

    private static void deleteProductById() {
        productService.printProducts();
        System.out.println("Please input the product id you wish to delete");
        int productId = Integer.parseInt(scanner.nextLine());
        if(productService.getProductById(productId) == null) {System.out.println("This id does not exist"); return;}
        productService.deleteProductById(productId);
        System.out.println("Product deleted successfully");
    }

    private static void editProductById() {
        productService.printProducts();
        System.out.println("Please input the product id you wish to edit");
        int productId = Integer.parseInt(scanner.nextLine());
        if(productService.getProductById(productId) == null) {System.out.println("This id does not exist"); return;}
        System.out.println("Please input the product name you wish to edit");
        String name = scanner.nextLine();
        System.out.println("Please input the description you wish to edit");
        String description = scanner.nextLine();
        System.out.println("Please input the price you wish to edit");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input the quantity you wish to edit");
        int quantity = Integer.parseInt(scanner.nextLine());
        categoryService.printCategories();
        System.out.println("Please input the category's id you wish to edit ");
        int categoryId = Integer.parseInt(scanner.nextLine());
        Category category = categoryService.getCategoryById(categoryId);
        productService.updateProductById( productId,name, description, price, quantity, category);
        System.out.println("Product edited successfully");


    }

    private static void addProduct() {
        System.out.println("Please inout name of the product");
        String name = scanner.nextLine();
        System.out.println("Please inout description of the product");
        String description = scanner.nextLine();
        System.out.println("Please inout price of the product");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please inout quantity of the product");
        int quantity = Integer.parseInt(scanner.nextLine());
        categoryService.printCategories();
        System.out.println("Please inout id of category");
        int categoryId = Integer.parseInt(scanner.nextLine());
        Category category = categoryService.getCategoryById(categoryId);
        Product product = Product.builder()
                .name(name)
                .description(description)
                .price(price)
                .quantity(quantity)
                .category(category)
                .build();
        productService.add(product);
        System.out.println("Product added!!!!!");
    }


    private static void deleteCategoryById() {
        categoryService.printCategories();
        System.out.print("Please input the id of the category you would like to delete");
        int categoryId = Integer.parseInt(scanner.nextLine());
        if (categoryService.getCategoryById(categoryId) == null) { System.out.println("This id dose not exist");return;}
        categoryService.deleteCategoryByID(categoryId);
        System.out.println("Category deleted successfully");

    }

    private static void editCategoryById() {
        categoryService.printCategories();
        System.out.println("Please input category Id");
        int categoryId = Integer.parseInt(scanner.nextLine());
        if (categoryService.getCategoryById(categoryId) == null) { System.out.println("This id is not true");return;}
        System.out.println("Please input category Name which you want to edit");
        String categoryName = scanner.nextLine();
        categoryService.updateCategoryById(categoryId, categoryName);

        System.out.println("Category edited successfully");

    }

    private static void addCategory() {
        System.out.println("Please input the name of the category");
        String categoryName = scanner.nextLine();
        categoryService.add(Category.builder()
                .name(categoryName)
                .build());
        System.out.println("Category added!!!!");

    }
}