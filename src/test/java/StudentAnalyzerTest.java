import org.example.StudentAnalyzer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    StudentAnalyzer analyzer = new StudentAnalyzer();

    // --- Kiểm thử countExcellentStudents ---
    @Test
    public void testCountExcellentStudents_MixedValidInvalid() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_AllValidExcellent() {
        List<Double> scores = Arrays.asList(8.0, 9.0, 10.0);
        assertEquals(3, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCountExcellentStudents_AllInvalid() {
        List<Double> scores = Arrays.asList(-1.0, 11.0, 15.0);
        assertEquals(0, analyzer.countExcellentStudents(scores));
    }

    // --- Kiểm thử calculateValidAverage ---
    @Test
    public void testCalculateValidAverage_MixedValidInvalid() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(8.17, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.0);
    }

    @Test
    public void testCalculateValidAverage_OnlyZerosAndTens() {
        List<Double> scores = Arrays.asList(0.0, 10.0, 10.0, 0.0);
        assertEquals(5.0, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testCalculateValidAverage_AllInvalid() {
        List<Double> scores = Arrays.asList(-5.0, 15.0);
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.0);
    }
}
