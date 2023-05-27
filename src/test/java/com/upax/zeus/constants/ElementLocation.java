package com.upax.zeus.constants;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.openqa.selenium.Dimension;

@Data
@AllArgsConstructor
public class ElementLocation {
    private Dimension size;
    private int x;
    private int y;
}
