import java.util.*;

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    private String type;   // Rectangular / Cylindrical
    private String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Cargo Assignment Method with try-catch-finally
    public void assignCargo(String cargo) {
        try {
            // Rule: Rectangular cannot carry Petroleum
            if (type.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe Assignment: Rectangular bogie cannot carry Petroleum"
                );
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println("✅ Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("❌ Error: " + e.getMessage());

        } finally {
            System.out.println("ℹ️ Cargo assignment attempt completed for " + type + " bogie\n");
        }
    }
}

// Main Class
public class UC15SafeCargoAssignment {
    public static void main(String[] args) {

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Test Cases

        // ✅ Safe Assignment
        b1.assignCargo("Petroleum");

        // ❌ Unsafe Assignment (Handled)
        b2.assignCargo("Petroleum");

        // ✅ Another Safe Assignment
        b2.assignCargo("Coal");

        System.out.println("🚆 Program continues after handling exceptions!");
    }
}