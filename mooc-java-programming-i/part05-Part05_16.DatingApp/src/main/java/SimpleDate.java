
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        if (this.day >= 30) {
            this.day = 1;
            if (this.month == 12) {
                this.month = 1;
                this.year++;
            } else {
                this.month++;
            }
        } else {
            this.day++;
        }
    }

    public void advance(int howManyDays) {
        int totalDays = this.day + howManyDays; // Calcula el total de días después de avanzar
        int daysInMonth = 30; // Todos los meses tienen 30 días

        // Avanzar hasta que no queden días
        while (totalDays > daysInMonth) {
            // Si los días restantes superan los días en el mes actual
            totalDays -= daysInMonth; // Restar los días del mes actual
            this.month++; // Avanzar al siguiente mes
            if (this.month > 12) { // Si superamos diciembre, avanzamos al siguiente año
                this.month = 1;
                this.year++;
            }
        }
        // Actualizar el día restante después de completar los meses
        this.day = totalDays;

        // Comprobar si se necesita avanzar al siguiente mes
        if (this.day == daysInMonth) {
            this.month++;
            this.day = 1;
            if (this.month > 12) { // Si superamos diciembre, avanzamos al siguiente año
                this.month = 1;
                this.year++;
            }
        }
    }

    public SimpleDate afterNumberOfDays(int howManyDays) {
        int newDay = this.day;
        int newMonth = this.month;
        int newYear = this.year;
        int totalDays = this.day + howManyDays;
        int daysInMonth = 30;

        System.out.println(newDay+ "| " + newMonth + "| " + newMonth);
        while (totalDays > daysInMonth) {
            totalDays -= daysInMonth;
            newMonth++;
            if (newMonth > 12) {
                newMonth = 1;
                newYear++;
            }
        }
        newDay = totalDays;

        if (newDay == daysInMonth) {
            newMonth++;
            newDay = 1;
            if (newMonth > 12) {
                newMonth = 1;
                newYear++;
            }
        }

        SimpleDate newDate = new SimpleDate(newDay, newMonth, newYear);
        return newDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

}
