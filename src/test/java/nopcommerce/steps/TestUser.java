package nopcommerce.steps;

/**
 * The demo site only lets an e-mail address register once. The features use {@code body@example.com}; this class
 * swaps it for an address that is unique to the test run, so the registration scenario can run again and the
 * login scenarios use the account it created.
 */
public final class TestUser {

    private static final String PLACEHOLDER = "body@example.com";
    private static final String UNIQUE_EMAIL = "body" + System.currentTimeMillis() + "@example.com";

    private TestUser() {
    }

    public static String email(String requested) {
        return PLACEHOLDER.equals(requested) ? UNIQUE_EMAIL : requested;
    }
}