package bookstore;

import java.awt.print.Book;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookImport {

    private static List<Book> listOfBooks = new ArrayList<>();
    private static List<Author> listOfAuthors = new ArrayList<>();
    private static List<Category> listOfCategories = new ArrayList<>();

    public static void main(String[] args) throws IOException {
//        String file = readFile("books.csv");
//        String file2 = readLineToTab("books.csv");
//        List<Book> file1 = readBooksFromFile("books.csv");
        List<Author> file2 = readAuthorsFromFile("authors.csv");
        List<Category> file3 = readCategoryFromFile("categories.csv");
    }

    public static String readFile(String plik) throws IOException {
        FileReader fileReader = new FileReader(plik);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String textLine = bufferedReader.readLine();
        do {
            System.out.println(textLine);
            textLine = bufferedReader.readLine();
        } while (textLine != null);
        bufferedReader.close();
        return textLine;
    }

    public static String readLineToTab(String plik) throws IOException {
        FileReader fileReader = new FileReader(plik);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String textLine = bufferedReader.readLine();
        do {
            System.out.println(textLine);
            textLine = bufferedReader.readLine();
        } while (textLine != null);
        bufferedReader.close();
        return textLine;
    }

    public static List<Book> readBooksFromFile(String plik) throws IOException {
        List<String> list = new ArrayList<>();
        InputStream is = new FileInputStream(plik);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader reader = new BufferedReader(isr);
        Author author = null;
        Category category = null;
        while (reader.ready()) {
            String line = reader.readLine();
            list.add(line);
            String[] stringArray = line.split(";");
            author.setId(Integer.parseInt(stringArray[5]));
            category.setId(Integer.parseInt(stringArray[6]));
            Book book = new Book(
 //                   Integer.valueOf(stringArray[0]),stringArray[1], stringArray[2],
   //                 stringArray[3], stringArray[4],Integer.valueOf(stringArray[5])
            );
            listOfBooks.add(book);
        }
        reader.close();
        isr.close();
        is.close();
        return listOfBooks;
    }

    public static List<Author> readAuthorsFromFile(String plik) throws IOException {
        List<String> list = new ArrayList<>();
        InputStream is = new FileInputStream(plik);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader reader = new BufferedReader(isr);
        while (reader.ready()) {
            String line = reader.readLine();
            list.add(line);
            String[] stringArray = line.split(";");
            Author author = new Author(
                    Integer.valueOf(stringArray[0]), stringArray[1], Integer.valueOf(stringArray[2]));
            listOfAuthors.add(author);
        }
        reader.close();
        isr.close();
        is.close();

        return listOfAuthors;
    }

    public static List<Category> readCategoryFromFile(String plik) throws IOException {
        List<String> list = new ArrayList<>();
        InputStream is = new FileInputStream(plik);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader reader = new BufferedReader(isr);
        while (reader.ready()) {
            String line = reader.readLine();
            list.add(line);
            String[] stringArray = line.split(";");
            Category category = new Category(
                    Integer.valueOf(stringArray[0]), stringArray[1], Integer.valueOf(stringArray[2]));
            listOfCategories.add(category);
        }

        reader.close();
        isr.close();
        is.close();
        return listOfCategories;
    }
}