public class Archive {
    
    private String issueNumber;
    private String name;

    public Archive(String issueNumber, String name) {
        this.issueNumber = issueNumber;
        this.name = name;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return issueNumber + " : " + name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedArchive = (Archive) compared;

        if (this.issueNumber.equals(comparedArchive.issueNumber) &&
                this.name.equals(comparedArchive.name)) {
            return true;
                } else {
                    return false;
                }
    }
}
