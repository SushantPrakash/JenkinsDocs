pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                // Add your build steps here, e.g., compile code, package artifacts
                sh 'mvn clean install -DskipTests=true' // Skip tests during the build
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                // Add your test steps here, e.g., run unit tests, integration tests
                sh 'mvn test' // Run tests separately
            }
        }
        stage('Complete'){
            steps{
                echo 'Job completed'
                echo 'Build and test successful'
            }
        }
    }
}
