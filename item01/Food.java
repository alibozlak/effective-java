package item01;

class Food {
    private boolean isHotFood;

    public Food(boolean isHotFood) {
        this.isHotFood = isHotFood;
    }

    public boolean isHotFood() {
        return isHotFood;
    }
    
    public static Food hotFood(){
        return new Food(true);
    }

    public static Food coldFood(){
        return new Food(false);
    }
}
