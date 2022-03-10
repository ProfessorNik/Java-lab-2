# Java-lab-2
Стековый калькулятор.

##1. Цель проекта
Написать стековый калькулятор, который принимает в качестве аргумента командой
строки имя файла, содержащего команды. Если аргумента нет, то использовать
стандартный поток ввода для чтения команд.
##2. Описание системы
Система состоит из следующих фунциональных блоков:
1. Парсер командной строки
2. Считыватель команд
3. Парсер команд
4. Исполнитель команд
5. Стек команд
###2.1. Парсер командной строки
Нужно дать возможность пользователю вводить команды либо с терминала либо с файла.
Если пользователь первым аргументом подал имя файла, то считывание будет производиться с файла, 
иначе ввод будет производиться с терминала.
###2.2. Считыватель команд
В зависимости от того какой режим ввода команд вбрал пользователь, данный функциональный блок
либо считывает со терминала(до символа окончания ввода '.'), либо читает файл по строчно.
!!Если файла с поданным именем не существует парсер выкидывает _exception_.
###2.3. Парсер команд
Пользуясь считываетелем команд, парсит файл и создает стек команд и их аргументов, при не соответствии команд
и аргументво выбрасывается _exception_.
###2.4. Исполнитель команд
Имеет в себе стек команд и стек, хранящий в себе числа и константы. Используя стек чисел и констант, а также контекст исполения, исполнитель
команд берет команды из стека команд и исполняет их, при наличии ошибок в логике команд выкидывает runtime exception. Также исполение каждой 
команды **логируется** 
###2.5. Стек команд
Может содержать в себе одну из следующих команд:
1. '#' - строка с комментарием. Не запоминается в стек.
2. POP, PUSH — снять/положить число со/на стек(а). (При передачи в PUSH константы, которой не существует выбрасывается exception)
3. +, -, *, /, SQRT – арифметические операции. Используют один или два верхних элемента стека, изымают их из стека, помещая результат назад
4. PRINT — печать верхнего элемента стека (без удаления).
5. DEFINE — задать значение константы. В дальнейшем везде использовать вместо параметра это значение.(При задачи одной и той же константы 2 раза выбрасывается exception)

При выполении некоторых операций в стеке может не оказаться нужного числа параметров, тогда выбрасывается exception
###2.6. Стек чисел и констант
Стек может содержать в себе:
1. Число
2. Константа, объявляемая DEFINE и содержащаяся в контексте исполения
###2.7. Контекст исполения
Содержит в себе таблицу констант и их значений

