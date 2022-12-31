package item01;

/**
 * Constructor yerine Static Factory Method kullanın.
 */
class Item01 {

    public static void main(String[] args) {

        Food menemen1 = new Food(false);
        System.out.println("Menemen sicak yemek mi : " + menemen1.isHotFood());

        System.out.println("-----------");

        Food menemen2 = Food.hotFood();     // <--- Bunun daha okunabilir oldugu iddia edilmekte
        System.out.println("Menemen sicak yemek mi : " + menemen2.isHotFood());

        Food appetizer = Food.coldFood();
        System.out.println("Meze sicak yemek mi : " + appetizer.isHotFood());

        // Static factory method'un 2. avantajı : Metod her çağırıldığında yeni nesne olusturulmuyor!
    }
}