pipeline {
    agent any

    tools {
        maven 'Maven-3.8.6'   // name configured in Global Tool Configuration
        jdk 'JDK-11'          // name configured in Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/saurabhkumar14/JenkinsTest.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
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
            echo '✅ Build and Tests successful!'
        }
        failure {
            echo '❌ Build or Tests failed. Please check console logs.'
        }
    }
}
