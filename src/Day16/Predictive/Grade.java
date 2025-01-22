package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class GradeValue {
    String name;
    int grade;

    public GradeValue(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
public class Grade {
        public void GradeHigher(List<GradeValue> l, Predicate<GradeValue> predicate)
        {
            for(GradeValue v : l)
            {
                if(predicate.test(v))
                {
                    System.out.println(v.getName());
                }
            }
        }
        public static void main(String[] args) {
            List<GradeValue> l = new ArrayList<>();
            l.add(new GradeValue("John", 75));
            l.add(new GradeValue("Alice", 55));
            l.add(new GradeValue("Mark", 88 ));
            Predicate<GradeValue> predicate = (v) -> v.getGrade() > 60;
            Grade v = new Grade();
            v.GradeHigher(l, predicate);
        }

}
