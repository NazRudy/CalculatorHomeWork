package com.naz.calculatorhomework;

/**
 * Операции счета
 */
public class Calculation {
    public Double result = 0d;                  // результат счета
    private String numOne = "";                 // Второе число
    public String numTwo = "";                  // Первое число
    private Boolean addbool = false;            // Флаг, будет сложение
    private Boolean subbool = false;            // Флаг, будет вычитание
    private Boolean mulbool = false;            // Флаг, будет умножение
    private Boolean divbool = false;            // Флаг, будет деление

    /**
     * Ввод номера
     *
     * @param numOne - номер
     */
    public void setNumOne(String numOne) {
        this.numOne = this.numOne + numOne;
    }

    /**
     * Выход результата нажатий
     *
     * @return - результат ввода
     */
    public String getResult() {
        result = Double.parseDouble(numOne);
        return result.toString();
    }

    /**
     * Установка флага сложения
     *
     * @param addbool - флаг сложения
     */
    public void setAddbool(Boolean addbool) {
        this.addbool = addbool;
        if (this.addbool) {
            numTwo = numOne;            // Фиксирование первого набора
            numOne = "";                // Подготовка переменной
        }
    }

    /**
     * Установка флага вычитания
     *
     * @param subbool - флаг вычитания
     */
    public void setSubbool(Boolean subbool) {
        this.subbool = subbool;
        if (this.subbool) {
            numTwo = numOne;            // Фиксирование первого набора
            numOne = "";                // Подготовка переменной
        }
    }

    /**
     * Установка флага умножения
     *
     * @param mulbool - флаг умножения
     */
    public void setMulbool(Boolean mulbool) {
        this.mulbool = mulbool;
        if (this.mulbool) {
            numTwo = numOne;            // Фиксирование первого набора
            numOne = "";                // Подготовка переменной
        }
    }

    /**
     * Установка флага деления
     *
     * @param divbool - флаг деления
     */
    public void setDivbool(Boolean divbool) {
        this.divbool = divbool;
        if (this.divbool) {
            numTwo = numOne;            // Фиксирование первого набора
            numOne = "";                // Подготовка переменной
        }
    }

    /**
     * Сброс состояния при нажатии на С
     */
    public void reset() {
        numOne = "";
        numTwo = "";
        addbool = false;
        subbool = false;
        mulbool = false;
        divbool = false;

    }

    /**
     * Запуск расчета по нажатию =
     */
    public void finished() {
        if (addbool) add();
        if (subbool) sub();
        if (mulbool) mul();
        if (divbool) div();

    }

    /**
     * Выход результата расчетов
     *
     * @return - результат
     */
    public String getFinished() {
        return result.toString();
    }

    /**
     * Сложение
     */
    public void add() {
        result = Double.parseDouble(numTwo) + Double.parseDouble(numOne);
        addbool = false;
    }

    /**
     * Вычитание
     */
    public void sub() {
        result = Double.parseDouble(numTwo) - Double.parseDouble(numOne);
        subbool = false;
    }

    /**
     * Умножение
     */
    public void mul() {
        result = Double.parseDouble(numTwo) * Double.parseDouble(numOne);
        mulbool = false;
    }

    /**
     * Деление
     */
    public void div() {
        result = Double.parseDouble(numTwo) / Double.parseDouble(numOne);
        divbool = false;
    }
}
