import org.example.Octagon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OctagonTest {

    @Test
    public void testAreaCalculation() {
        // Создаем объект Octagon со стороной 5
        Octagon octagon = new Octagon(5);

        // Вычисленная площадь должна быть близка к 120.71 (округление до двух знаков)
        double expectedArea = 120.71;
        double actualArea = octagon.getArea();

        // Проверяем, что площадь вычислена корректно
        assertEquals(expectedArea, actualArea, 0.01, "Площадь вычислена неверно");
    }

    @Test
    public void testPerimeterCalculation() {
        // Создаем объект Octagon со стороной 5
        Octagon octagon = new Octagon(5);

        // Периметр должен быть равен 40 (8 * 5)
        double expectedPerimeter = 40;
        double actualPerimeter = octagon.getPerimeter();

        // Проверяем, что периметр вычислен корректно
        assertEquals(expectedPerimeter, actualPerimeter, "Периметр вычислен неверно");
    }

    @Test
    public void testClone() {
        // Создаем объект Octagon со стороной 5
        Octagon octagon1 = new Octagon(5);

        // Клонируем объект
        Octagon octagon2 = octagon1.clone();

        // Проверяем, что клон имеет ту же площадь и периметр
        assertEquals(octagon1.getArea(), octagon2.getArea(), "Площади клонов не совпадают");
        assertEquals(octagon1.getPerimeter(), octagon2.getPerimeter(), "Периметры клонов не совпадают");
    }

    @Test
    public void testCompareTo() {
        // Создаем два объекта Octagon с разными сторонами
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = new Octagon(6);

        // Проверяем, что octagon1 меньше octagon2
        assertTrue(octagon1.compareTo(octagon2) < 0, "Сравнение по площади некорректно");

        // Проверяем, что octagon2 больше octagon1
        assertTrue(octagon2.compareTo(octagon1) > 0, "Сравнение по площади некорректно");

        // Создаем объект с той же стороной, что и octagon1
        Octagon octagon3 = new Octagon(5);

        // Проверяем, что octagon1 равен octagon3
        assertEquals(0, octagon1.compareTo(octagon3), "Сравнение по площади некорректно");
    }

    @Test
    public void testSetSide() {
        // Создаем объект Octagon со стороной 5
        Octagon octagon = new Octagon(5);

        // Устанавливаем новую сторону
        octagon.setSide(7);

        // Проверяем, что сторона изменилась
        assertEquals(7, octagon.getSide(), "Сторона не изменилась после вызова setSide()");

        // Проверяем, что площадь и периметр пересчитаны
        double expectedArea = 236.5929291125633; // Примерное значение для стороны 7
        double expectedPerimeter = 56;

        assertEquals(expectedArea, octagon.getArea(), 0.01, "Площадь после изменения стороны вычислена неверно");
        assertEquals(expectedPerimeter, octagon.getPerimeter(), "Периметр после изменения стороны вычислен неверно");
    }
}