package ru.epam;

public class StringPractice {
    private int cycles;
private StringBuilder csvString = new StringBuilder("Cycle,Memory\n");
private Runtime rt = Runtime.getRuntime();

    public StringPractice(int cycles) {
        this.cycles = cycles;
    }

    public String SBPratice() {
        StringBuilder str = new StringBuilder("");
        int cycleCount = 0;

        for (int i = 0; i < cycles; i++) {

            if ((++cycleCount) == 5000) {
                long used = (rt.totalMemory() - rt.freeMemory());
                csvString.append(i+1);
                csvString.append(',');
                csvString.append(used);
                csvString.append("\n");
                cycleCount = 0;
            }

            str.append(i);
        }

        return csvString.toString();
    }

    public String stringConcat() {
        String str = "";
        System.out.println(str.hashCode());
        int cycleCount = 0;
        // long used = (rt.totalMemory() - rt.freeMemory());

        for (int i = 0; i < cycles; i++) {
            if ((++cycleCount) == 5000) {
                long used = (rt.totalMemory() - rt.freeMemory());
                csvString.append(i+1);
                csvString.append(',');
                csvString.append(used);
                csvString.append("\n");
                cycleCount = 0;
            }
            str += "f";
            //cycleCount++;
        }
        return csvString.toString();
    }

}

