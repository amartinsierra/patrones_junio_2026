package composite;

import java.util.List;

public class Test implements Componente {
    private String title;
    private List<String> questions;
    public Test(String title,List<String> questions) {
        this.title = title;
        this.questions=questions;
    }

    @Override
    public void showInfo() {
        System.out.println("Test: " + title+ " with questions: "+questions);
    }
}
