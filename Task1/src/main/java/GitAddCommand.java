import picocli.CommandLine;

@CommandLine.Command(
  name = "add"
)
public class GitAddCommand implements Runnable {

    public void run() {
        System.out.println("Adding some files to the staging area");
    }
}