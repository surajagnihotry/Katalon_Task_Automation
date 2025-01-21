# Katalon Task Automation

This project contains automated test scenarios created using **Katalon Studio v10** to verify core functionalities of the Application Given"https://magento.softwaretestingboard.com/". The scenarios were designed and implemented as part of an assigned task to ensure seamless test experiences across different features.

---

## Scenarios Covered

### **Scenario 1** [P1]
- **Title**: Guest User Registration  
- **Description**:  
- **Steps**:
  1. Navigate to the registration page.
  2. Fill out the registration form with valid details.
  3. Submit the form.
  4. Verify the registration confirmation and login functionality.

---

### **Scenario 2** [P1]
- **Title**: Add to Cart  
- **Description**:  
  As a logged-in user, I want to browse the **Men’s** category, select **Jackets**, choose the second item in the list, and add it to the cart.  
- **Steps**:
  1. Login to the application.
  2. Navigate to the **Men’s** category.
  3. Select **Jackets**.
  4. Choose the second product in the list.
  5. Add the selected product to the cart.
  6. Verify the product is added to the cart.

---

### **Scenario 3** [P2]
- **Title**: Checkout Order  
- **Description**:  
  As a logged-in user, I want to navigate to my cart and complete the checkout process, including entering payment details.  
- **Steps**:
  1. Login to the application.
  2. Navigate to the cart page.
  3. Review items in the cart.
  4. Proceed to checkout.
  5. Fill in payment and shipping details.
  6. Confirm the order and verify the success message.

---

### **Scenario 4** [P3]
- **Title**: Search for Products  
- **Description**:  
  As a user, I want to search for products with the keyword **“Nike”** and validate whether the search results are displayed correctly.  
- **Steps**:
  1. Login to the application.
  2. Use the search bar to enter the keyword **“Nike”**.
  3. Submit the search query.
  4. Assert that search results are displayed, or handle cases where no results are found.

---

## Prerequisites
- **Tools**:  
  - Katalon Studio v10  
  - Java Development Kit (JDK 8+)  
  - Git for version control  

- **Setup**:
  - Clone this repository:
    ```bash
    git clone https://github.com/yourusernamesurajagnihotry/katalon-task-automation.git
    ```
  - Open the project in **Katalon Studio**.
  - Configure test data, object repositories, and environment settings as required.

## Project Structure
├── Data Files             # Not Used
├── Drivers                # Contains web drivers (e.g., ChromeDriver, GeckoDriver) required for browser execution.
├── Keywords               #No Custom Keywords Used.
├── Libs                   # External libraries and dependencies added to the project.
├── Object Repository      # Stores web elements (objects) used in test cases (e.g., buttons, input fields).
├── Profiles               # Used Default Only.
├── Reports                # Execution reports, including logs, screenshots, Test Recordings and HTML reports.
├── Settings               # Project-specific settings like execution configurations.
├── Test Cases             # Contains individual test scripts written in Groovy and Java Script.
├── Test Suites            # Groups of related test cases for execution.


## How to Execute Tests
1. Open **Katalon Studio**.
2. Navigate to the `Test Cases` folder to run individual test scenarios:
   - Right-click on a test case and select **Run**.
3. To execute a group of tests:
   - Navigate to the `Test Suites` folder.
   - Right-click on a test suite and select **Run**.

## Contact
For any queries, feel free to contact:  
**Suraj Agnihotry**: [suraj4allfriends@gmail.com] 
**GitHub Profile**: [https://github.com/surajagnihotry]

## License
This project not required a License.
