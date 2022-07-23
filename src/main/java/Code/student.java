package Code;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class student {
    private int std;
    private String nomStudent;
    private String prénomStudent;

    public static void main(String[] args) {
        student a= new student(21007, "RAMANATSOA", "Cédric");
        System.out.println(a);
    }
}
