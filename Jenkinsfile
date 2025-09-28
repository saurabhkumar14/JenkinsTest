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
                echo "🔨 Building project..."
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                echo "🧪 Running unit tests..."
                sh 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

        stage('Archive Artifact') {
            steps {
                echo "📦 Archiving JAR..."
                archiveArtifacts artifacts: 'target/java-ci-demo-*-shaded.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo '✅ Build, Test & Packaging successful!'
        }
        failure {
            echo '❌ Build or Tests failed. Check Jenkins logs and JUnit reports.'
        }
    }
}
