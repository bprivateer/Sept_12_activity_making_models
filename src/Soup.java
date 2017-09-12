class Soup {
    String brand;
    int expireDate;
    boolean isVegetarian;

    public Soup(String brand, int expireDate, boolean isVegetarian){
        this.brand = brand;
        this.expireDate = expireDate;
        this.isVegetarian = isVegetarian;
    }

    public void printInfo(){
        System.out.println("brand is" + brand);
        System.out.println("It expires in the year of " + expireDate);
        System.out.println("Is it vegetarian?" + isVegetarian);

    }
}

class House {
    String neighborhood;
    int sqFeet;
    boolean forRent;

    public House(String neighborhood, int sqFeet, boolean forRent) {
        this.neighborhood = neighborhood;
        this.sqFeet = sqFeet;
        this.forRent = forRent;
    }

    public void printInfo(){
        System.out.println("rent is" + forRent);
        System.out.println("It has  " + sqFeet + "sqfeet");
        System.out.println("My place is located in the " + neighborhood + "neighborhood");

    }
}


class Runner{
    public static void main(String[] args){
         House myHouse = new House("Decatur", 2000,true);

         myHouse.printInfo();

        Soup mySoup = new Soup("cambells", 3000, false);

        mySoup.printInfo();

    }
}