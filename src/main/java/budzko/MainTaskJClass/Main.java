package budzko.MainTaskJClass;


public class Main {
    public static void main (String [] args) {
        Book [] book = new Book[5];
        book[0]  = new Book(1, "АСТ 2062:время машин. ", "Уолш Т. ", "АСТ", 2019, 320, 29.30, "Твердый");
        book[1] = new Book(2,"Homo Futurus. Облачный Мир. ", "Закарайя А. ", "АСТ", 2018, 540, 18.33, "Твердый" );
        book[2] = new Book(3, "Разговор с вождем. ", "Роман Злотников ", "Издательство Э", 2015, 416, 10.20, "Мягкий");
        book[3] = new Book(4, "Путь к Порогу. ", "Роман Злотников ", "Сегмент", 2011, 354, 12.54, "Мягкий");
        book[4] = new Book(5, "Сила подсознания, или Как изменить жизнь за 4 недели. ", "Диспенза Джо", "Эксмо", 2013, 18, 20.20, "Твердый");

         for (int i = 0; i < 5; i++) {
          System.out.println(book[i].toString());
        }

        System.out.println("\n  Книги Романа Злотникова \n");
        for (int i = 0; i < 5; i++) {
            book[i].showAuthor();
        }

        System.out.println("\n  Книги выпущенные после 2015 года. \n");
        for (int i = 0; i < 5; i++) {
            book[i].showYear();
        }

        System.out.println("\n  Книги выпущенные издательством АСТ \n");
        for (int i = 0; i < 5; i++) {
            book[i].showPublishing();
        }
    }
}
