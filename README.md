README - QA Framework for Resume Builder

Overview

This repository contains the initial draft of the QA framework designed for the Resume Builder application. It is a work-in-progress developed by the QA team to ensure a robust and scalable testing solution. Below is a summary of the current structure and key components added to the framework.

Framework Structure

The framework is organized into the following main directories:

Data

Intended to store constants and data providers for test cases.

Maps

Contains mapping classes to handle UI elements or API data structures.

Pages

Houses the Page Object Model (POM) classes, enabling modular and reusable design for UI tests.

Test

Includes the test cases and test runners.

Utils

Contains utility classes essential for framework operations.

Resources

Stores additional files such as test suites and configuration files.

Key Components

Utils Classes

Several utility classes have been developed to enhance the functionality of the framework:

BaseTest

Sets up the core framework, including initializing drivers and managing global configurations.

CommonCommands

Provides common methods for interacting with web elements or performing general operations.

ExcelUtils

Enables reading data directly from .xlsx files, useful for data-driven testing.

ExtentReportManager

Manages the generation of HTML-based test execution reports.

JsonUtils

Facilitates JSON file reading and parsing for configuration or data validation.

LoggerUtil

Provides logging functionality for better debugging and tracking.

ScreenshotUtils

Captures screenshots during test execution, particularly for failed test cases.

Resources

Regression Suite

Focuses on validating comprehensive application functionality.

Smoke Suite

Designed for quick checks to ensure basic application stability.

Future Plans

Enhance the framework with advanced reporting and CI/CD integration.

Expand test coverage and add additional test cases for critical application features.

Improve modularity and scalability for larger teams and projects.

Feel free to contribute to this repository by creating issues or submitting pull requests for improvements and additional features. Together, we can build a comprehensive QA framework for the Resume Builder application!

