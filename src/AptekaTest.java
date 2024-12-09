import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AptekaTest {
    private Apteka apteka;

    @Before
    public void setUp() {
        apteka = new Apteka("Тестовая Аптека");
        apteka.addMedicine("Тестовое Лекарство 1", 100.0);
        apteka.addMedicine("Тестовое Лекарство 2", 200.0);
    }

    @Test
    public void testGetFullInfo() {
        String expectedInfo = "Аптека: Тестовая Аптека\nЛекарства:\n" +
                "Тестовое Лекарство 1 - 100.0 руб.\n" +
                "Тестовое Лекарство 2 - 200.0 руб.\n";
        assertEquals(expectedInfo, apteka.getFullInfo());
    }

    @Test
    public void testGetHighestPrice() {
        assertEquals(200.0, apteka.getHighestPrice(), 0.001);
    }

    @Test
    public void testGetTotalCost() {
        assertEquals(300.0, apteka.getTotalCost(), 0.001);
    }

    @Test
    public void testRemoveMedicine() {
        apteka.removeMedicine("Тестовое Лекарство 1");
        assertEquals(1, apteka.getMedicinesCount());
        assertEquals(200.0, apteka.getHighestPrice(), 0.001);
    }

    @Test
    public void testFindMedicineByName() {
        Lekarstvo foundMedicine = apteka.findMedicineByName("Тестовое Лекарство 2");
        assertNotNull(foundMedicine);
        assertEquals("Тестовое Лекарство 2", foundMedicine.getName());
        assertEquals(200.0, foundMedicine.getPrice(), 0.001);
    }
}
