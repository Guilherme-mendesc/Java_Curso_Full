package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class ProgramStringBuilder {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(sdf.parse("26/09/2022 12:06:55"),
				"Viajando para Nova Zelandia",
				"Vou visitar esse país maravilhoso",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
	Comment c3 = new Comment("Good night");
	Comment c4 = new Comment("May a force be with you");
	Post p2 = new Post(sdf.parse("27/09/2022 12:06:55"),
			"Boa noite à todos",
			"Seis e onibus",
			5);
	p2.addComment(c3);
	p2.addComment(c4);
	
	System.out.println(p1);
	System.out.println(p2);

	}
	

}
