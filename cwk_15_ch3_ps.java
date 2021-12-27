import javax.sound.sampled.SourceDataLine;

public class cwk_15_ch3_ps {
    public static void main(String[] args) {
        // question 1
        String name = "JOHN PARKER";
        name = name.toLowerCase();
        System.out.println(name);
        // question 2
        String text = "to Lower Case";
        text = text.replace(" ", "_");
        System.out.println(text);
        // question 3
        String letter = "Dear <|name|>, Thanks alot!";
        letter = letter.replace("<|name|>", "sharia");
        System.out.println(letter);
        // question 4
        String myString = "This String contains   double or triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
        // question 5
        String letter2 = "Dear kamil,\n\t This Java course is nice. \nThanks!";
        System.out.println(letter2);
    }
}
