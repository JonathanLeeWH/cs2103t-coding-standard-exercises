package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * An example code for task.
 */
public class Task {

    private static final String DESCRIPTION_PREFIX = "description: ";
    // A list of past descriptions.
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

    /**
     * Returns the DESCRIPTION_PREFIX followed by the description.
     * @return A string with the format DESCRIPTION_PREFIX followed by the description.
     */
    @Override
    public String toString() {
        return DESCRIPTION_PREFIX + description;
    }
}
