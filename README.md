# Library-Database

How To Add A Book In Your List Of Books: 

1. Create a list [listOfBooks l1 = new listOfBooks();]
2. use the .add() command [l1.add("Test Title",250,3.0,"Test Genre","This is the description of the book.");]

How To Get The Entire List Of Books? 

1. use the .getListOfBooks() [NOTE! THIS WILL PRINT THE DATA AS WELL, SO THAT YOU DON'T HAVE TO SEARCH IT AGAIN!!!!]
2. l1.getListOfBooks();

IF YOU WANT TO GET ONLY THE TITLES, USE :

1. use the .getTitlesOfBooks();
2. l1.getTitlesOfBooks();

How To Search A Book If You Know Its Title[It will print the data about that book]

1. use the .getByTitle();
2. .getByTitle("Test Title");

How to search books by ratings

1. use the .getByRating();
2. l1.getByRating(1); [It will search the books that have the rating >= to 1]

How to search books by genres

1.use the .getByGenre();
2.l1.getByGenre("Test Genre");

How to get the total of pages the books from your list add up to

1.use the .getPages();
2.l1.getPages();

How to get the number of books in your list:

1. use the .getNumberOfBooks();
2. l1.getNumberOfBooks();
