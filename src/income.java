import com.company.Apple;
import com.company.Made_in;

public class income extends Apple {
    public income(int price,  int model, String color, int dateOfRelease, Made_in made_in) {
        super(price,  model, color, dateOfRelease, made_in);
    }

    @Override
    public void setColor() {
        super.setColor();
        System.out.println("The majority of Iphone was sold in Pink color");
    }
}
