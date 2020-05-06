package TreeMap;

public class Library implements Comparable<Library>
{
   int libNum;
	int totalBooks;

	Library(int LibNum, int TotalBooks)
	{
		this.libNum = LibNum;
		this.totalBooks = TotalBooks;
	}

	@Override
	public int compareTo(Library o) {
		
		return this.libNum-o.libNum;
	}
}
