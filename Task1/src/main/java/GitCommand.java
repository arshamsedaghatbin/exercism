import picocli.CommandLine;

@CommandLine.Command(
)
public class GitCommand implements Runnable {
    public static void main(String[] args){
        CommandLine commandLine = new CommandLine(new GitCommand());
        commandLine.addSubcommand("add", new GitAddCommand());
        commandLine.addSubcommand("commit", new GitCommitCommand());
        commandLine.parseWithHandler(new CommandLine.RunLast(), args);
        CommandLine.run(new GitCommand(), args);
    }
 
    public void run() {
        System.out.println("The popular git command");
    }
}