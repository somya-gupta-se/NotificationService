pipeline {
    agent any

    tools {
        maven 'M3'    // name must match Jenkins Maven installation
        jdk 'JDK17'   // name must match Jenkins JDK setup
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Fetching code from GitHub...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project with Maven 🧱'
                sh 'mvn clean compile'
            }
        }

        /* stage('Test') {
            steps {
                echo 'Running unit tests 🧪'
                sh 'mvn test'
            }
        } */

        stage('Package') {
            steps {
                echo 'Packaging JAR 📦'
                sh 'mvn package'
            }
        }

        stage('Archive') {
            steps {
                echo 'Archiving build artifacts 📁'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo '✅ Build completed successfully!'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
}
