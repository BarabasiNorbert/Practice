package org.fasttrackit;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        RetirementCalculator retirementCalculator = new RetirementCalculator();

        RetirementCalculatorPrinter printerRetirementCalculator = new RetirementCalculatorPrinter(retirementCalculator);

        printerRetirementCalculator.provideInputs();

        printerRetirementCalculator.printRetirementCalculationInfos();
    }
}


