// package Oops_Concept.Major_Pillers.AbstarctionDemo.Demo_1;
//Industry-Based Example 1: Abstract Class - Payment Gateway Integration
/*
 * Scenario: A large e-commerce platform needs to integrate with various payment gateways
 * (e.g., PayPal, Stripe, Visa/Mastercard direct). While each gateway has its unique API 
 * calls and security measures, there are common steps involved in any payment transaction:
 *  initiating payment, processing the payment, and verifying the status.

Why Abstract Class?

All payment gateways share a common "is-a" relationship: they are all a type of 
PaymentGateway.
There might be some common logic (e.g., logging transactions, handling currency 
conversion errors) that can be shared across all payment gateway integrations.
Certain core methods (like processPayment or verifyPaymentStatus) must be implemented by 
each specific gateway, but their internal implementation will differ significantly.
 */

 // --- Abstract Class: BasePaymentGateway ---
// Represents the common contract and shared logic for any payment gateway
abstract class BasePaymentGateway {
    private String gatewayName;
    private String merchantId; // Common configuration for all gateways

    public BasePaymentGateway(String gatewayName, String merchantId) {
        this.gatewayName = gatewayName;
        this.merchantId = merchantId;
        System.out.println("Initializing " + this.gatewayName + " with Merchant ID: " + this.merchantId);
    }

    // Abstract methods: Must be implemented by concrete subclasses
    // These define "what" a payment gateway must do, not "how"
    public abstract boolean processPayment(double amount, String currency, String transactionDetails);
    public abstract String getTransactionStatus(String transactionId);

    // Concrete method: Shared logic for all payment gateways
    public void logTransaction(String transactionId, double amount, boolean success) {
        System.out.println("Log: Transaction ID " + transactionId + " for " + amount + " " + (success ? "successful" : "failed") + " via " + gatewayName);
    }

    // Getter for common property
    public String getGatewayName() {
        return gatewayName;
    }
}

// --- Concrete Class: PayPalGateway ---
// Specific implementation for PayPal
class PayPalGateway extends BasePaymentGateway {
    private String apiKey;
    private String apiSecret;

    public PayPalGateway(String merchantId, String apiKey, String apiSecret) {
        super("PayPal", merchantId);
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        System.out.println("PayPal specifics: API Key configured.");
    }

    @Override
    public boolean processPayment(double amount, String currency, String transactionDetails) {
        System.out.println("PayPal: Processing payment of " + amount + " " + currency + " for " + transactionDetails);
        // Simulate actual PayPal API call
        boolean success = Math.random() > 0.1; // 90% chance of success
        String transactionId = "PAYPAL_" + System.currentTimeMillis();
        logTransaction(transactionId, amount, success); // Call shared logging method
        return success;
    }

    @Override
    public String getTransactionStatus(String transactionId) {
        System.out.println("PayPal: Checking status for " + transactionId);
        // Simulate actual PayPal API call to get status
        return "COMPLETED"; // Or PENDING, FAILED
    }
}

// --- Concrete Class: StripeGateway ---
// Specific implementation for Stripe
class StripeGateway extends BasePaymentGateway {
    private String secretKey;

    public StripeGateway(String merchantId, String secretKey) {
        super("Stripe", merchantId);
        this.secretKey = secretKey;
        System.out.println("Stripe specifics: Secret Key configured.");
    }

    @Override
    public boolean processPayment(double amount, String currency, String transactionDetails) {
        System.out.println("Stripe: Initiating payment of " + amount + " " + currency + " for " + transactionDetails);
        // Simulate actual Stripe API call
        boolean success = Math.random() > 0.05; // 95% chance of success
        String transactionId = "STRIPE_" + System.currentTimeMillis();
        logTransaction(transactionId, amount, success); // Call shared logging method
        return success;
    }

    @Override
    public String getTransactionStatus(String transactionId) {
        System.out.println("Stripe: Fetching status for " + transactionId);
        // Simulate actual Stripe API call to get status
        return "SUCCESS"; // Or FAILED, REFUNDED
    }
}

// --- Main Application ---
public class PaymentSystem {
    public static void main(String[] args) {
        System.out.println("--- Integrating with Payment Gateways ---");

        // Use PayPal Gateway
        BasePaymentGateway payPal = new PayPalGateway("MERCH_001_PP", "pp_api_key_xyz", "pp_api_secret_abc");
        boolean ppSuccess = payPal.processPayment(99.50, "USD", "Order #12345");
        System.out.println("PayPal payment status: " + (ppSuccess ? "SUCCESS" : "FAILURE"));
        System.out.println("PayPal transaction status: " + payPal.getTransactionStatus("PAYPAL_1700000000")); // Example ID

        System.out.println("\n----------------------------------------\n");

        // Use Stripe Gateway
        BasePaymentGateway stripe = new StripeGateway("MERCH_002_STR", "sk_live_stripe_secret_def");
        boolean stSuccess = stripe.processPayment(250.00, "EUR", "Subscription Renewal");
        System.out.println("Stripe payment status: " + (stSuccess ? "SUCCESS" : "FAILURE"));
        System.out.println("Stripe transaction status: " + stripe.getTransactionStatus("STRIPE_1700000001")); // Example ID
    }
}

    
/*
 Explanation:
The BasePaymentGateway abstract class defines the fundamental operations common to all 
payment processing. 
It also includes a concrete logTransaction method, indicating that logging behavior is 
consistent regardless of the specific gateway. Each concrete gateway (PayPalGateway, 
StripeGateway) is forced to implement processPayment and getTransactionStatus according 
to its unique API, thereby abstracting away the internal complexities of each gateway from 
the main application logic. The client code (PaymentSystem.java) interacts with the generic 
BasePaymentGateway type, not knowing the specific implementation details.
 */