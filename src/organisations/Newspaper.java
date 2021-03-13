package organisations;

public class Newspaper {

    private String name; //нужно будет назвать NewYork times

    public Newspaper(String name) {
        this.name = name;
    }

    private String firsString = "----------------------------------\n";

    private String lastString = "\n  Вчера, примерно в 18:30, десятью вооруженными грабителями был ограблен " +
            "\nбанк Санкт-Петербург, сумма награбленного состовляет более 3.000.000 фертингов." +
            "\n  Сообщается, что грабители были переодеты в полицейскую форму, что осложняло  " +
            "\nположение. Во время перестрелки были ранены 7 сотрудников полиции, в том числе" +
            "\nШмыгль, умудрившийся порвать штаны и потерять каску";


    public void publishNews() {
        System.out.println(firsString);
        printSecondString();
        slowDown(1000);
        printLastString();
        for (int i=0;i<4;i++){
            System.out.print(".");
            slowDown(1000);
        }
    }

    private void printSecondString() {
        String secondString = "                       Газета " + name + " сообщает: ";
        char[] text = secondString.toCharArray();
        for (int i = 0; i < secondString.length(); i++) {
            System.out.print(text[i]);
           slowDown(30);
        }
    }

    private void printLastString(){
        char[] text = lastString.toCharArray();
        for (int i = 0; i < lastString.length(); i++) {
            System.out.print(text[i]);
            slowDown(30);
        }
    }

    public String getName() {
        return name;
    }

    private void slowDown(long time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            //this will never happen
        }
    }
}


