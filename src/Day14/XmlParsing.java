package Day14;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class XmlParsing {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            File file = new File("C:\\Users\\devad\\IdeaProjects\\untitled\\src\\Day14\\data.xml");
            parser.parse(file, new MyHandler());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class MyHandler extends DefaultHandler {
    @Override
    public void startDocument() throws SAXException {
        System.out.println("Starting Document Parsing...");
    }
    @Override
    public void endDocument() throws SAXException {
        System.out.println("Document Parsing Completed.");
    }
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Start Element: " + qName);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End Element: " + qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String content = new String(ch, start, length).trim();
        if (!content.isEmpty()) {
            System.out.println("Content: " + content);
        }
    }
}
