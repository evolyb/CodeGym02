public class Main {
    public static void main(String[] args) {
        ProductManagement myProductManager = new ProductManagement();
//        myProductManager.add(new Product(0,"Galaxy S10","SamSung",1000,""));
//        myProductManager.add(new Product(1,"Galaxy S11","SamSung",2000,""));
//        myProductManager.add(new Product(2,"Iphone 7","Iphone",1500,""));
//        myProductManager.add(new Product(3,"Iphone X","Iphone",2000,""));
        try {
           myProductManager =  FileManager.readProduct("output.dat");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
//        myProductManager.add(new Product(4,"Iphone XI","Iphone",3000,""));
            for (Product product:myProductManager.myProducts){
                System.out.println(product.toString());
            }
        try {
            FileManager.saveProduct(myProductManager,"output.dat");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
