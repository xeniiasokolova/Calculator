package calculator;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
        Menu(){
            JLabel text = new JLabel("<html> Калькулятор. Версия 1.0<br> " +
                    "©Соколова Ксения Дмитриевна, 2022. Все права защищены.<br><br>" +
                    "Программа позволяет производить следующие расчеты: <br>"+
                    "<li> сложение;</li>" +
                    "<li> вычитание;</li>" +
                    "<li> умножение;</li>" +
                    "<li> деление;</li>" +
                    "<li> расчет квадратного корня;</li>" +
                    "<li> возведение числа во вторую степень;</li>" +
                    "<li> перевести число в проценты;</li>" +
                    "<li> получить модуль числа. </li><br>" +
                    "Программа предусматривает ввод целых и дробных чисел. " +
                    "Ввод данных осуществляется нажатием мышки на кнопки калькулятора. "
                    + "Результат отображается на панели ввода.</html>");

            setTitle("Справка");
            setSize(440,300);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);
            text.setFont(new Font("arial", Font.PLAIN, 12));
            text.setVerticalAlignment(JLabel.VERTICAL);
            getContentPane().add(text);
            setVisible(true);
        }
}
