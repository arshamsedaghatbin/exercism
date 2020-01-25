import picocli.CommandLine;

@CommandLine.Command(
  name = "commit"
)
public class GitCommitCommand implements Runnable {
    public void run() {
        System.out.println("Committing files in the staging area, how wonderful?");
    }
}