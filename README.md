# nopCommerce Selenium + Cucumber Tests

[![Build](https://github.com/AbdelrahmanGamal1998/nopcommerce-selenium-cucumber-tests/actions/workflows/build.yml/badge.svg)](https://github.com/AbdelrahmanGamal1998/nopcommerce-selenium-cucumber-tests/actions/workflows/build.yml)

A BDD web UI test suite for the public [nopCommerce demo store](https://demo.nopcommerce.com/), written with
Java, Selenium WebDriver, Cucumber and TestNG using the Page Object pattern. It was my first test automation
project (2022).

## What is covered

| Feature file | Scenarios |
| --- | --- |
| `F1_Registertion` | Register a new customer |
| `F2_Login_to_website` | Log in with valid data, and with wrong data (error message and its color) |
| `F4_Searchengine` | Search by product name and by SKU (data-driven with `Scenario Outline`) |
| `F5_price` | Switch the currency to Euro |
| `F6_website_catgory` | Open a category and sub-category |
| `F7_Slide_bar` | Open products from the home page slider |
| `F8_links` | Footer links: Facebook, Twitter, RSS, YouTube |
| `F9_futurelist` | Add products to the wishlist and check it |

## Structure

```
src/test/resources/features/        Gherkin features (tagged @smoke)
src/test/java/nopcommerce/pages/    page objects: locators of each page
src/test/java/nopcommerce/steps/    step definitions and Hooks (browser start and stop)
src/test/java/nopcommerce/runners/  TestNG + Cucumber runner (reports in target/)
```

## Run it

You need JDK 17 or newer, Maven and Google Chrome (Selenium 4 downloads the matching driver itself).

```bash
git clone https://github.com/AbdelrahmanGamal1998/nopcommerce-selenium-cucumber-tests.git
cd nopcommerce-selenium-cucumber-tests
mvn test                      # headless Chrome
mvn test -Dheadless=false     # watch the browser
```

Reports: `target/cucumber.html` and `target/cucumber.json`.

## Status and limits

- **The demo site blocks automated traffic from some networks** (it answered `403 Forbidden` when the suite was
  rebuilt in 2026), so the live run could not be completed there. It may also have changed its page layout since
  2022, so some locators (especially the absolute XPaths of the slider and the registration link) may need updating.
- What is checked on every push: the project compiles and a Cucumber **dry run** confirms that all 67 steps in the
  features have a matching step definition (`mvn test -Dcucumber.execution.dry-run=true`).
- Changes made when it was rebuilt: Maven layout and packages in lower case, newer Selenium and Cucumber, headless
  option, no bundled `chromedriver.exe`, a unique e-mail for the registration scenario (the site accepts an address
  only once), and a missing scenario title in the wishlist feature.

## License

[MIT](LICENSE)