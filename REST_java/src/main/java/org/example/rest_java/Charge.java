package org.example.rest_java;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Charge {
    int idx;
    long cost;
    String genre;
    String date;
    String description;
}
