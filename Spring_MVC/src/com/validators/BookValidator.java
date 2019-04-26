package com.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.beans.Book;

public class BookValidator implements Validator {

	@Override
	public boolean supports(Class<?> book_class) {
		return book_class.equals(Book.class);
	}

	@Override
	public void validate(Object obj, Errors error) {
		Book book = (Book) obj;
		
		if (book.getBookName().length() < 5) {
			error.rejectValue("bookName", "bookName.required", "Please enter the Book Name");
		}
		
		if (book.getISBN() <= 1501) {
			error.rejectValue("ISBN", "ISBN.required", "Please enter correct ISBN number");
		}
		
		if (book.getPublication().length() == 0) {
			error.rejectValue("publication", "publication.required", "Please enter the Publication");
		}
		
		if (book.getPrice() <= 0) {
			error.rejectValue("price", "price.incorrect",	"Please enter a Correct correct price");
		}
		
		if (book.getDescription().length() == 0) {
			error.rejectValue("description", "description.required", "Please enter the Book Description");
		} else if (book.getDescription().length() < 10 || book.getDescription().length() >  40) {
			error.rejectValue("description", "description.length",
					"Please enter description within 40 charaters only");
		}
		
		if (book.getAuthor().length() <= 0) {
			error.rejectValue("author", "author.required", "Please Enter Author's Name");
		}
		

		
	}

}
