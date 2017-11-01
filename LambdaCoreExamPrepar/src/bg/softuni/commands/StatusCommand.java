package bg.softuni.commands;

import bg.softuni.annotations.Inject;
import bg.softuni.models.cores.Core;
import bg.softuni.repository.Repository;

/**
 * Created by Niki on 4.8.2016 г..
 */
public class StatusCommand extends Command {

    @Inject
    private Repository repository;

    @Override
    public String execute() {
        StringBuilder output = new StringBuilder();
        output.append("Lambda Core Power Plant Status:")
                .append(System.lineSeparator())
                .append("Total Durability: ")
                .append(this.repository.getTotalDurability())
                .append(System.lineSeparator())
                .append("Total Cores: ")
                .append(this.repository.getTotalCores())
                .append(System.lineSeparator())
                .append("Total Fragments: ")
                .append(this.repository.getTotalFragments());

        for (Core core : this.repository) {
            output.append(System.lineSeparator())
                    .append(String.format("Core %s:", core.getName()))
                    .append(System.lineSeparator())
                    .append(String.format("####Durability: %d", core.getDurability()))
                    .append(System.lineSeparator())
                    .append(String.format("####Status: %s", core.status()));
        }

        return output.toString();
    }
}
