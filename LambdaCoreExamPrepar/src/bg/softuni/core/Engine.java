package bg.softuni.core;

import bg.softuni.commands.CommandInterpreter;
import bg.softuni.commands.Executable;
import bg.softuni.commands.Interpreter;
import bg.softuni.factories.coreFactory.CoreFactory;
import bg.softuni.factories.coreFactory.CoreFactoryImpl;
import bg.softuni.factories.fragmentFactory.FragmentFactory;
import bg.softuni.factories.fragmentFactory.FragmentFactoryImpl;
import bg.softuni.io.reader.Reader;
import bg.softuni.io.writer.Writer;
import bg.softuni.repository.CoreRepository;
import bg.softuni.repository.Repository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Niki on 4.8.2016 г..
 */
public class Engine implements Runnable {

    private Reader reader;
    private Writer writer;
    private CoreFactory coreFactory;
    private FragmentFactory fragmentFactory;
    private Repository repository;
    private Interpreter commandInterpreter;

    public Engine(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
        this.coreFactory = new CoreFactoryImpl();
        this.fragmentFactory = new FragmentFactoryImpl();
        this.repository = new CoreRepository();
        this.commandInterpreter = new CommandInterpreter(this.coreFactory,
                this.fragmentFactory,
                this.repository);
    }

    @Override
    public void run() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {

        String input = this.reader.readLine();

        while (true) {
            if (input.equals("System Shutdown!")) {
                break;
            }

            String[] data = input.split("[:@]+");
            String command = data[0];
            Executable exe = this.commandInterpreter.interpretCommand(data, command);

            String result = exe.execute();
            this.writer.writeLine(result);

            input = this.reader.readLine();
        }
    }
}
