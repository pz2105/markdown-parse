import static org.junit.Assert.*;

import java.beans.Transient;
import java.io.IOException;


import java.nio.file.Path;
import java.util.ArrayList;
import java.nio.file.Files;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }


    @Test
    public void testGetLinks() throws IOException {
        Path fileName = Path.of("/Users/peterzhong/Documents/GitHub/markdown-parse/test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = new ArrayList<>();
        links.add("https://something.com");
        links.add("some-page.html");
        assertEquals(links, MarkdownParse.getLinks(contents));
    }
}