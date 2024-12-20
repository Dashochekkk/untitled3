package org.example;

import java.util.Date;

// Базовый класс GeometricObject
public class GeometricObject {
    private String color = "белый";
    private boolean filled;
    private Date dateCreated;

    // Конструктор без аргументов
    public GeometricObject() {
        dateCreated = new Date();
    }

    // Конструктор с указанным цветом и заливкой
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    // Геттер для цвета
    public String getColor() {
        return color;
    }

    // Сеттер для цвета
    public void setColor(String color) {
        this.color = color;
    }

    // Геттер для заливки
    public boolean isFilled() {
        return filled;
    }

    // Сеттер для заливки
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Геттер для даты создания
    public Date getDateCreated() {
        return dateCreated;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "создан " + dateCreated + ",\nцвет: " + color + ", заливка: " + filled;
    }

    // Метод для получения площади (должен быть переопределен в подклассах)
    public double getArea() {
        return 0;
    }

    // Метод для получения периметра (должен быть переопределен в подклассах)
    public double getPerimeter() {
        return 0;
    }
}
