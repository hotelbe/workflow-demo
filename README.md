# Workflow Demo

This project demonstrates how to integrate and use workflow engines with Spring Boot. It includes multiple branches to show the migration process from Activiti 5.22.0 to Flowable 7.1.0.

## Branches

- **activiti5**: Integration of Spring Boot 2.3.8.RELEASE, JDK 1.8, and Activiti 5.22.0.
- **activiti5-jpa**: Adds Activiti JPA dependency to the activiti5 branch.
- **activiti7**: Upgrades the activiti5 branch to Spring Boot 3.4.0, JDK 17, and Activiti 7.1.0.M6.
- **flowable7**: Replaces Activiti 7.1.0.M6 with Flowable 7.1.0 in the activiti7 branch.
- **main**: Same as the flowable7 branch.

## Setup

1. Clone the repository:
    ```sh
    git clone https://github.com/your-repo/workflow-demo.git
    cd workflow-demo
    ```

2. Checkout the desired branch:
    ```sh
    git checkout <branch-name>
    ```

3. Build the project:
    ```sh
    mvn clean install
    ```

4. Run the application:
    ```sh
    mvn spring-boot:run
    ```

## Testing with Postman

Postman scripts are included to test the workflow. Import the Postman collection from the `postman` directory and run the requests.

## Branch Details

You can view the code changes and configurations for each branch through the git commit history.

### activiti5

- **Spring Boot**: 2.3.8.RELEASE
- **JDK**: 1.8
- **Activiti**: 5.22.0

### activiti5-jpa

- Adds Activiti JPA dependency to the activiti5 branch.
- Changes include adding JPA configuration and dependencies to `pom.xml` and updating the application configuration.

### activiti7

- **Spring Boot**: 3.4.0
- **JDK**: 17
- **Activiti**: 7.1.0.M6
- Changes include updating dependencies in `pom.xml`, modifying application configuration, and updating code to be compatible with the new versions.

### flowable7

- Replaces Activiti 7.1.0.M6 with Flowable 7.1.0.
- Changes include updating dependencies in `pom.xml`, modifying application configuration, and updating code to be compatible with Flowable.

### main

- Same as the flowable7 branch.

## License

This project is licensed under the Apache License 2.0. See the [LICENSE](./LICENSE) file for details.
