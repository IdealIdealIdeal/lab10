

import classes.Faculty;
import classes.Institute;
import classes.ResearchAssociate;



public class Main {

    public static void main(String[] args) {
        Faculty fkn = new Faculty("ФКН");
        Institute toizi = new Institute("ТОиЗИ", "297");
        Institute is = new Institute("ИС", "387");
        Institute tst = new Institute("ЦТ", "311п");
        Institute itu = new Institute("ИТУ", "312п");
        Institute piit = new Institute("ПиИТ", "380");
        fkn.setInstitutes(new Institute[]{toizi, is, tst, itu, piit});
        ResearchAssociate emp1 = new ResearchAssociate(1234, "Трифонов Дмитрий Владимирович",
                "Защита информации");
        ResearchAssociate emp2 = new ResearchAssociate(1234, "Лулунтев Даниил Алекснадрович",
                "Моделирование систем");
        ResearchAssociate emp3 = new ResearchAssociate(1234, "Соловьёв Алекснадр Ильич",
                "Интеллектуальные системы");
        ResearchAssociate emp4 = new ResearchAssociate(1234, "Токарь Максим Юрьевич",
                "Распознавание образов");
        ResearchAssociate emp5 = new ResearchAssociate(1234, "Науменко Феликс Алекснадрович",
                "Технологии обработки информации");
        toizi.setEmployees(new ResearchAssociate[]{emp1, emp2, emp3, emp4, emp5});
        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("Кафедры на факультете " + fkn.getName() + ": \n");
        for (int i = 0; i < fkn_institutes.length; i++) {
            System.out.println(fkn_institutes[i].getName());
        }
        System.out.println("\n");
        ResearchAssociate[] toizi_employees = toizi.getEmployees();
        System.out.println("Сотрудники кафедры " + toizi.getName() + ": \n");
        for (int i = 0; i < toizi_employees.length; i++) {
            System.out.println(toizi_employees[i].getName());
        }

    }
}
