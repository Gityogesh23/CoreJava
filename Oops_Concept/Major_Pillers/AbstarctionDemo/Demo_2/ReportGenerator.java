// package Oops_Concept.Major_Pillers.AbstarctionDemo.Demo_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap; // To maintain insertion order for JSON

// --- Interface: DataExporter ---
// Defines the contract for any class that can export data
interface DataExporter {
    String getExportFormat(); // Returns the format (e.g., "CSV", "PDF")
    void export(List<Map<String, String>> data, String filePath) throws IOException;
}

// --- Implementation: CsvDataExporter ---
class CsvDataExporter implements DataExporter {
    @Override
    public String getExportFormat() {
        return "CSV";
    }

    @Override
    public void export(List<Map<String, String>> data, String filePath) throws IOException {
        System.out.println("Exporting data to " + filePath + " in CSV format...");
        try (FileWriter writer = new FileWriter(filePath)) {
            if (data == null || data.isEmpty()) {
                writer.append("No data to export.\n");
                return;
            }

            // Write header (assuming all maps have the same keys)
            boolean headerWritten = false;
            if (!data.isEmpty()) {
                StringBuilder header = new StringBuilder();
                for (String key : data.get(0).keySet()) {
                    header.append("\"").append(key).append("\",");
                }
                writer.append(header.substring(0, header.length() - 1)).append("\n"); // Remove trailing comma
                headerWritten = true;
            }

            // Write data rows
            for (Map<String, String> row : data) {
                StringBuilder rowString = new StringBuilder();
                for (String key : row.keySet()) { // Iterate through keys to maintain order if using LinkedHashMap
                    rowString.append("\"").append(row.get(key)).append("\",");
                }
                writer.append(rowString.substring(0, rowString.length() - 1)).append("\n"); // Remove trailing comma
            }
            System.out.println("CSV export complete!");
        }
    }
}

// --- Implementation: JsonDataExporter ---
class JsonDataExporter implements DataExporter {
    @Override
    public String getExportFormat() {
        return "JSON";
    }

    @Override
    public void export(List<Map<String, String>> data, String filePath) throws IOException {
        System.out.println("Exporting data to " + filePath + " in JSON format...");
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.append("[\n");
            for (int i = 0; i < data.size(); i++) {
                Map<String, String> row = data.get(i);
                writer.append("  {\n");
                boolean firstEntry = true;
                for (Map.Entry<String, String> entry : row.entrySet()) {
                    if (!firstEntry) writer.append(",\n");
                    writer.append("    \"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\"");
                    firstEntry = false;
                }
                writer.append("\n  }");
                if (i < data.size() - 1) {
                    writer.append(",");
                }
                writer.append("\n");
            }
            writer.append("]\n");
            System.out.println("JSON export complete!");
        }
    }
}

// --- Main Application ---
public class ReportGenerator {

    // A utility method that can work with any DataExporter
    public static void generateReport(DataExporter exporter, List<Map<String, String>> data, String fileName) {
        System.out.println("\n--- Generating " + exporter.getExportFormat() + " Report ---");
        try {
            exporter.export(data, fileName + "." + exporter.getExportFormat().toLowerCase());
        } catch (IOException e) {
            System.err.println("Error generating report: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Sample data to export
        List<Map<String, String>> customerData = new ArrayList<>();
        Map<String, String> customer1 = new LinkedHashMap<>(); // Use LinkedHashMap for predictable JSON order
        customer1.put("ID", "C001");
        customer1.put("Name", "Alice Smith");
        customer1.put("Email", "alice@example.com");
        customer1.put("City", "New York");
        customerData.add(customer1);

        Map<String, String> customer2 = new LinkedHashMap<>();
        customer2.put("ID", "C002");
        customer2.put("Name", "Bob Johnson");
        customer2.put("Email", "bob@example.com");
        customer2.put("City", "Los Angeles");
        customerData.add(customer2);

        Map<String, String> customer3 = new LinkedHashMap<>();
        customer3.put("ID", "C003");
        customer3.put("Name", "Charlie Brown");
        customer3.put("Email", "charlie@example.com");
        customer3.put("City", "Chicago");
        customerData.add(customer3);

        // Generate CSV report
        generateReport(new CsvDataExporter(), customerData, "customers_report");

        // Generate JSON report
        generateReport(new JsonDataExporter(), customerData, "customers_report");

        // Imagine a PdfDataExporter could be added easily here
        // generateReport(new PdfDataExporter(), customerData, "customers_report");
    }
}
/*
 Explanation:
 The DataExporter interface acts as a contract, stating that any class implementing it must
 provide getExportFormat() and export() methods. The CsvDataExporter and JsonDataExporter 
 classes provide their specific implementations for these methods, handling the distinct 
 logic for CSV and JSON formatting respectively. The ReportGenerator's generateReport 
 method operates solely on the DataExporter interface type, completely oblivious to 
 whether it's dealing with a CSV or JSON exporter internally. This allows for easy 
 extensibility; if a new export format (like PDF) is needed, a new class implementing 
 DataExporter can be added without changing any existing code that uses the interface.
 */