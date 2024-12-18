# OOP - JAVA

## №1 Принципы ООП: Инкапсуляция, наследование, полиморфизм*
1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура
2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе

## №2 Принципы ООП Абстракция и интерфейсы. Пример проектирования*
Реализовать класс Market и все методы, которые он обязан реализовывать. Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет состояние магазина (принимает и отдает заказы).

## 3 Некоторые стандартные интерфейсы Java и примеры их использования*
1. Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable.
2. Создать класс StreamComparator, реализующий сравнение количества групп входящих в Поток.
3. Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator.
4. Модифицировать класс Контроллер, добавив в него созданный сервис.
5. Модифицировать класс Контроллер, добавив в него метод сортирующий список потоков, путем вызова созданного сервиса.

## 4 Обобщения. ч1*
1. Создать класс УчительСервис и реализовать аналогично проделанному на семинаре.
2. Создать класс УчительВью и реализовать аналогично проделанному на семинаре.
3. Создать класс УчительКонтроллер и реализовать возможность создания, редактирования конкретного учителя и отображения списка учителей, имеющихся в системе.

## 5 От простого к практике*
1. Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и список Студентов.
2.  Создать класс УчебнаяГруппаСервис, в котором реализована функция(входные параметры - (Teacher, List<Student>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его.
3. Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id) и формирования учебной группы, путем вызова метода из сервиса.

## 6. ООП Дизайн и Solid
Проект work6: продемонстрировать применение принципов, усвоенных на семинаре.
Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему.
===========================================================================================================
### Work 1.
LSP.
В данном примере нарушен принцип Liskov substitution principle. который гарантирует, что порожденный класс
не изменяет определение типа родительского и его поведение:
Класс-наследник Square изменяет поведение родительского класса Rectangle в установке высоты и ширины.
Для соблюдения принципа LSP применен рефакторинг:
- Создан базовый класс QuadRangle, объединяющий четырехугольные фигуры, от которого наследуются
  классы Square и Restangle.
- Square и Restangle реализуют метод area класса QuadRangle.

---------------------------------------------------------------------------
### Work 2.
ISP.
В данном примере нарушен принцип Interface segregation principle, который гарантирует, что клиенты
не реализуют интерфейсы, которые они не используют:
Класс AccountReportGenerator использует не все методы класса ReportGenerator.
Для соблюдения принципа ISP применен рефакторинг:
- Класс ReportGenerator разделен на ReportGeneratorXml с методом String generateXml()
  и ReportGeneratorJson с методом String generateJson().
- Класс AccountReportGenerator реализует класс ReportGeneratorJson с методом String generateJson(),
  который он использует.
- Класс DocumentReportGenerator реализует и класс ReportGeneratorXml и класс ReportGeneratorJson,
  используя методы String generateXml() и String generateJson().
---------------------------------------------------------------------------
### Work 3.
OCP.
В данном примере нарушен принцип Open-closed principle, который гарантирует, что класс открыт
для будущего расширения, но остается закрытым для модификации внутренней реализации:
Класс Greeter содержит стили приветствия  в методе greet(), и в случае необходимости их изменения
потребуется править функциональность этого метода.
Для соблюдения принципа ISP применен рефакторинг:
- Создан класс interface Greet для вынесения приветствия.
- Созданы классы CasualGreeting, FormalGreeting, IntimateGreeting, NoPersonalGreeting реализующие Greet.

## 7 Семинар: ООП Дизайн и Solid ч.2*

Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
Применить при создании программы архитектурные паттерны, добавить логирование калькулятора. Соблюдать принципы SOLID, паттерны проектирования.

