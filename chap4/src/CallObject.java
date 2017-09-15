import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CallObject {
    public static void main(String[] args) {

        List<File> files = new ArrayList<>();
        files.add(new File("aaa"));
        files.add(new File("cccc"));
        files.add(new File("bbbb"));

        files.sort(CaseInsensitiveFileComparator.INSTANCE);

        System.out.println(files);

    }
}
