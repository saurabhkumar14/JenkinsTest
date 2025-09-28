pipeline {
    agent any

    tools {
        maven 'Maven-3.9.3'   // configure under Manage Jenkins > Global Tool Configuration
        jdk 'JDK-17'          // configure under Manage Jenkins > Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                 git branch: 'master', url: 'https://github.com/saurabhkumar14/JenkinsTest.git'
            }
        }

        stage('Build') {
            steps {
                echo "Building project..."
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                echo "Running unit tests..."
                bat 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

    }

    post {
        success {
            echo 'Build, Test & Packaging successful!'
        }
        failure {
            echo 'Build or Tests failed. Check Jenkins logs and JUnit reports.'
        }
    }
}
