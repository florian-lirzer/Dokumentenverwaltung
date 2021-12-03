import java.util.ArrayList;

public class PrintManager
{
    ArrayList<Document> documents = new ArrayList<>();

    public void addDocument(Document d)
    {
        documents.add(d);
    }

    public void printAll()
    {
        for (Document document : documents)
        {
            document.printDocument();
        }
    }

    public Document findDocument(String filename)
    {
        for (Document document : documents)
        {
            if(filename.equals(document.fileName))
            {
                return document;
            }
        }
        return null;
    }
}
