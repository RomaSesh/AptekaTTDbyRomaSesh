import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AptekaTest {
    private Apteka apteka;

    @BeforeEach
    public void setUp() {
        apteka = new Apteka("Тестовая аптека");
        apteka.addMedicine("Парацетамол", 60.0);
        apteka.addMedicine("Ибупрофен", 80.0);
    }

    @Test
    public void testGetFullInfo() {
        String expected = "Аптека: Тестовая аптека\nЛекарства:\nПарацетамол - 60.0 руб.\nИбупрофен - 80.0 руб.\n";
        assertEquals(expected, apteka.getFullInfo());
    }

    @Test
    public void testGetHighestPrice() {
        assertEquals(80.0, apteka.getHighestPrice());
    }

    @Test
    public void testGetTotalCost() {
        assertEquals(140.0, apteka.getTotalCost());
    }
}