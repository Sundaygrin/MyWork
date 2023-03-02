package DeeperLook;

public class Problem {
    private String name;

    private ProblemType type;
    private Boolean isSolved;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ProblemType getType() {
        return type;
    }

    public void setType(ProblemType type) {
        this.type = type;
    }

    public boolean isSolved() {
        return false;
    }
}
