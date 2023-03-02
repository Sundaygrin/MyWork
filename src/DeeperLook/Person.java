package DeeperLook;

import java.util.List;

public class Person {

    private List<Problem> problem;


    public String tellProblem() {
        String ourProblem = "";
        for (var problem : problem) {
            if (!problem.isSolved()) {
                ourProblem += problem.getName() + "\n";
            }
        }
        return ourProblem;
    }
}
