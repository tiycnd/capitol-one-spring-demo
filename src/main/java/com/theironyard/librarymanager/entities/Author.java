package com.theironyard.librarymanager.entities;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Author {
    private Integer id;

    @NotNull
    @Size(min = 1, message = "Name cannot be empty")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Author author = (Author) obj;
        return Objects.equals(id, author.getId()) && Objects.equals(name, author.getName());
    }
}
