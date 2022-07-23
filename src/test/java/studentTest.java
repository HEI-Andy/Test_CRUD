import Code.student;
import Code.studentRepositories;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class studentTest {
    @Test
    public void insertTest() throws SQLException {
        //Given
        student a= new student(21007, "RINDRASOA","Sarobidy");
        studentRepositories repo= new studentRepositories();

        //When
        repo.insert(a);

        //Then
        assertEquals(21007, repo.insert(21007));
    }

    public void selectTest() throws SQLException {
        //Given
        student b= new student(21007, "RAKOTONIRAINY","Daniel");
        studentRepositories repo= new studentRepositories();

        //When
        repo.insert(b);

        //Then
        assertEquals(21007, repo.select(21007));
    }

    public void updateTest() throws SQLException {
        //Given
        student c= new student(21007, "RAMAHEFASOA","Daniel");
        studentRepositories repo= new studentRepositories();

        //When
        repo.insert(c);

        //Then
        assertEquals("RAMAHEFASOA", repo.update(21007));
    }

    public void deleteTest() throws SQLException {
        //Given
        student d= new student(21007, "RAMAHEFASOA","Daniel");
        studentRepositories repo= new studentRepositories();

        //When
        repo.insert(d);

        //Then
        assertEquals("", repo.update(21007));
    }
}
