/**
 * Created by YM on 24.10.2015.
 */
public class VariablesInJava {
    public static void main(String[] args) {
        int numberOfProcessorCores = 4;
        //We also can use: String typeOfProcessorCores new String("Intel(R) Core(TM) i5")
        String typeOfProcessorCores = "\"Intel(R) Core(TM) i5\"";

        int numberOfNetworkAdapters = 4;
        String networkAdapterTypes = "\"Realtek PCIe, VMware Virtual\"";

        int numberOfKeyboards = 1;
        String keyboardType = "\"Logitech\"";

        //Print variables. String.format can be used also
        System.out.printf("%s%s, %d%n", "Processor cores: ", typeOfProcessorCores, numberOfProcessorCores);
        System.out.printf("%s%s, %d%n", "Network adapters: ", networkAdapterTypes, numberOfNetworkAdapters);
        System.out.printf("%s%s, %d%n", "Keyboards: ", keyboardType, numberOfKeyboards);

    }
}
