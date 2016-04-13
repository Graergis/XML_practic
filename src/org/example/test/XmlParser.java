package org.example.test;


import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class XmlParser {
    public static void main(String[] args) throws JAXBException, XMLStreamException, FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - вывод результата парсинга. 2 - конвертировать в json.");
        String numder = scanner.nextLine();
        JaxbParser jaxbParser = new JaxbParser(numder);
    }
}