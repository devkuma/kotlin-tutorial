import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Rename {


    public static void showFilesInDIr(String dirPath) throws IOException {
        File dir = new File(dirPath);
        File files[] = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            if (file.isDirectory()) {
                showFilesInDIr(file.getPath());
            } else if (file.getName().endsWith(".md")) {

                Path filePath = Paths.get(file.getPath());

                List<String> lines = Files.readAllLines(filePath);

                if (lines.get(3).startsWith("url: \"")) {

                    String url = lines.get(3);


                    StringBuffer sbLines = new StringBuffer();

                    for (String line : lines) {
                        //sbLines.append(line).append(System.lineSeparator());
                        if (line.startsWith("url: \"")) {

                            line = "url: \"" + line.substring(line.indexOf("url: \"") + "url: \"".length())
                                    .replace(",", "")
                                    .replace(".", "-")
                                    .replace("(", "-")
                                    .replace(")", "")
                                    .replace("_", "")
                                    .replace(" ", "-")
                                    .replace("--", "-")
                                    .toLowerCase()
                            ;




                            System.out.println(line);
                        }
                        sbLines.append(line).append(System.lineSeparator());
                    }

                    System.out.println("file: " + file + "---------------------------------------");
                    Files.write(filePath, sbLines.toString().getBytes());
                }


//                if (lines.size() < 3) {
//                    continue;
//                } else if (lines.get(2).startsWith("linkTitle")) {
//                    continue;
//                } else if (lines.get(1).startsWith("title")) {
//
//                    String title = lines.get(1);
//
//                    int lastIndex = title.lastIndexOf("|");
//                    if (lastIndex < 0) {
//                        continue;
//                    }
//
//                    System.out.println("file: " + file);
//                    System.out.println("linkTitle: \"" + title.substring(lastIndex + 1).trim());
//
//
//                    String linkTitle = title.substring(lastIndex + 1).trim();
//
//                    StringBuffer sbLines = new StringBuffer();
//                    int index = 0;
//                    for (String line: lines) {
//                        sbLines.append(line).append(System.lineSeparator());
//
//                        if (index == 1 && line.startsWith("title")) {
//                            sbLines.append("linkTitle: \"" + linkTitle).append(System.lineSeparator());
//                        }
//                        index++;
//                    }
//
//
//
//                    System.out.println("file: " + file + "---------------------------------------");
//                    //System.out.println(sbLines.toString());
//                    Files.write(filePath, sbLines.toString().getBytes());
//                } else {
//
//                    continue;
//                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Start........");

        showFilesInDIr("/Users/we/develop/blog/devkuma-hugo-blog/content/ko");
    }

}
