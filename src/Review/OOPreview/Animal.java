package Review.OOPreview;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;
    private String skinColor;

    public Animal() {
    }

    public Animal(String name, int age, String gender, String skinColor) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.skinColor = skinColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public String getAnimal() {
        return this.getClass().getName();
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public abstract void eat();

}
