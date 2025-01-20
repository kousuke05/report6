package jp.ac.uryukyu.e245729;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void testSchoolConstructor() {
        // Arrange
        String name = "Sample School";
        int requiredScore = 70;
        int requiredGrade = 100;

        // Act
        School school = new School(name, requiredScore, requiredGrade);

        // Assert
        assertEquals(name, school.name, "The school name should match the constructor input.");
        assertEquals(requiredScore, school.requiredScore, "The required score should match the constructor input.");
    }
}
