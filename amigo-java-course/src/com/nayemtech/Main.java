package com.nayemtech;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       InterfaceA a = new TmpMain();
       a.defaultMethod();
       a.normalMethod();
       InterfaceA.staticMethod();
    }
}