import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		List <Book> books = new ArrayList<>();
		books.add(b1);
		b1.setTitle("Java入門");
		b1.setPublishDate(f.parse("2011/10/07"));
		b1.setComment("スッキリわかる");
		
		books.add(b2);
		b2.setTitle("Phython入門");
		b2.setPublishDate(f.parse("2019/06/11"));
		b2.setComment("カレーが食べたくなる");
		;
		books.add(b3);
		b3.setTitle("C言語入門");
		b3.setPublishDate(f.parse("2018/06/21"));
		b3.setComment("ポインタも自由自在");
		
		Collections.sort(books, new TitleComparator() );
		
		for(Book h: books) {
			  System.out.println(h.getTitle() + f.format(h.getPublishDate() ) + h.getComment() );
		  }
	}

}
