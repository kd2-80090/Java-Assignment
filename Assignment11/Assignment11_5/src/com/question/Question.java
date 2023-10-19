


/*
	5. Store Books in HashMap<> so that for given isbn, 
		book can be searched in fastest possible time. 
		Do we need to write equals() and hashCode() in Book class? 
		Hint:
				// declare map: key=isbn, value=Book object
				Map<String,Book> map = new HashMap<>();
				// case 1: insert in map
				Book b = new Book();
				// accept book from user
				map.put(b.getIsbn(), b);
									
				// case 2: find in map
				String isbn = sc.next();
				Book f = map.get(isbn);	
																						
*/
