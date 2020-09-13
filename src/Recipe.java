package src;
import java.util.LinkedList;

public class Recipe
{
   private LinkedList<Ingredient> list = new LinkedList<>();

    public Recipe()
    {

    }
    public void addToRecipe(Ingredient ingredient)
    {
        list.add(ingredient);
        System.out.println("added to recipe");
    }
    public void removeFromRecipe(Ingredient ingredient)
    {
        list.remove(ingredient);
        System.out.println("removed ingredient" + ingredient);
    }
    public void clear()
    {
        list.clear();
    }
/*
    public static void main(String[] args)
    {
        Recipe r = new Recipe();
        Ingredient temp = new Ingredient("Suger", 17, Type.TABLESPOON);
        r.addToRecipe(temp);
        Converter c = new Converter(1);
        System.out.println(c.convert(temp));

    }
    */
}