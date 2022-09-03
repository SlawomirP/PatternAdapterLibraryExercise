package library;

import java.time.LocalDate;

public interface LibraryAPI {
    boolean isAviable(String bookTitle);

    LocalDate dueDate(String bookTitle, String pesel);

    boolean reserve(String bookTitle, String pesel);
}
