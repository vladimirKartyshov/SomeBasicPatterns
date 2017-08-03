package decorator;

public abstract class Decorator implements PrinterInterface{

    // абстрактный класс добавляется когда больше одного декоратора

    PrinterInterface component;

    public Decorator(PrinterInterface component) {
        this.component = component;
    }
    public void print(){
        component.print();
    }
}//=============================================================
 //1 в декораторе хранится одна ссылка на компонент а в composite хранится список этих компонентов
 //2 декоратор расширяет функциональность а в composite фун-ть внутренних компонентов не меняется

// декоратор использует один и тот же интерфейс(PrinterInterfface) а adapter меняет интерфейсы а
// функционал остается неизменным
