package org.javaparser.examples.chapter2;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.comments.Comment;

import java.io.FileInputStream;
import java.util.List;

public class CommentReporterStarter {

    private static final String FILE_PATH = "src/main/java/org/javaparser/examples/samples/ReversePolishNotation.java";

    public static void main(String[] args) throws Exception {

        CompilationUnit cu = JavaParser.parse(new FileInputStream(FILE_PATH));

        List<Comment> comments = cu.getAllContainedComments();
    }
}
