import java.util.ArrayList;

public class DokumentenverwaltungDemoApp
{
    public static void main(String[] args)
    {
        TextDocument textDocument = new TextDocument("TextDocument", "abcd");
        ImageDocument imageDocument = new ImageDocument("ImageDocument", 5, 10, "black");

        imageDocument.printDocument();
        textDocument.printDocument();

        ArrayList<String> strings = new ArrayList<>();
        strings.add("test123");
        CsvDocument csvDocument = new CsvDocument("CsvDocument", strings);
        csvDocument.addLine("test456");

        PrintManager printManager = new PrintManager();
        printManager.addDocument(textDocument);
        printManager.addDocument(imageDocument);
        printManager.addDocument(csvDocument);

        printManager.printAll();

        Document document = textDocument;
        document.printDocument();
    }
}
