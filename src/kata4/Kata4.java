package kata4;

import view.MailListReader;
import view.MailHistogramBuilder;
import view.HistogramDisplay;
import model.Histogram;
import model.Mail;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        String fileName = "email.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        
        Histogram<String> histogram= MailHistogramBuilder.build(mailList);

        new HistogramDisplay("Histograma-Version2",histogram).execute();
    }
}
