package com.naz.calculatorhomework;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Операции счета
 */
public class Calculation implements Parcelable {
    public Double result = 0d;                  // результат счета
    private String numOne = "";                 // Второе число
    public String numTwo = "";                  // Первое число
    private Boolean addbool = false;            // Флаг, будет сложение
    private Boolean subbool = false;            // Флаг, будет вычитание
    private Boolean mulbool = false;            // Флаг, будет умножение
    private Boolean divbool = false;            // Флаг, будет деление

    public Calculation() {

    }

    protected Calculation(Parcel in) {
        /*if (in.readByte() == 0) {
            result = null;
        } else {
            result = in.readDouble();
        }*/
        result = in.readDouble();
        numOne = in.readString();
        numTwo = in.readString();
        byte tmpAddbool = in.readByte();
        addbool = tmpAddbool == 0 ? null : tmpAddbool == 1;
        byte tmpSubbool = in.readByte();
        subbool = tmpSubbool == 0 ? null : tmpSubbool == 1;
        byte tmpMulbool = in.readByte();
        mulbool = tmpMulbool == 0 ? null : tmpMulbool == 1;
        byte tmpDivbool = in.readByte();
        divbool = tmpDivbool == 0 ? null : tmpDivbool == 1;
    }

    public static final Creator<Calculation> CREATOR = new Creator<Calculation>() {
        @Override
        public Calculation createFromParcel(Parcel in) {
            return new Calculation(in);
        }

        @Override
        public Calculation[] newArray(int size) {
            return new Calculation[size];
        }
    };

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
        numOne = "";
        numTwo = "";
    }

    /**
     * Вычитание
     */
    public void sub() {
        result = Double.parseDouble(numTwo) - Double.parseDouble(numOne);
        subbool = false;
        numOne = "";
        numTwo = "";
    }

    /**
     * Умножение
     */
    public void mul() {
        result = Double.parseDouble(numTwo) * Double.parseDouble(numOne);
        mulbool = false;
        numOne = "";
        numTwo = "";
    }

    /**
     * Деление
     */
    public void div() {
        result = Double.parseDouble(numTwo) / Double.parseDouble(numOne);
        divbool = false;
        numOne = "";
        numTwo = "";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        /*if (result == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(result);
        }*/
        parcel.writeDouble(result);
        parcel.writeString(numOne);
        parcel.writeString(numTwo);
        parcel.writeByte((byte) (addbool == null ? 0 : addbool ? 1 : 2));
        parcel.writeByte((byte) (subbool == null ? 0 : subbool ? 1 : 2));
        parcel.writeByte((byte) (mulbool == null ? 0 : mulbool ? 1 : 2));
        parcel.writeByte((byte) (divbool == null ? 0 : divbool ? 1 : 2));
    }
}
