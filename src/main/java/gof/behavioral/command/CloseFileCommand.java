package gof.behavioral.command;

//Command implementation
public class CloseFileCommand implements Command {

    private final FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}