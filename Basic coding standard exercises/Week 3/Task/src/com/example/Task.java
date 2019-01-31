package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * An example code for task.
 */
public class Task {

    private static final String DESCRIPTION_PREFIX = "description: ";
    private List<String> pastDescriptions = new ArrayList<>();
    private String description;
    private boolean isImportant;

    /**
     * A public constructor for Task class.
     * @param description dscription of the task.
     */
    public Task(String description) {
        this.description = description;
        if (!description.isEmpty()) {
            this.isImportant = true;
        }
    }

    /**
     * Gets the XML.
     * @return
     */
    public String getAsXml() {
        return "<task>" + description + "</task>";
    }

    /**
     * Prints the description as a string.
     */

    public void printDescription() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return DESCRIPTION_PREFIX + description;
    }
}
