@Library('docker-hello') _

pipeline {
    agent { label "master"}
    stages {
        stage ('Example Build') {
            steps {
                helloThere()
                dockerCmd 'version'
                dockerCmd 'built -t'
                dockerCmd 'images ls'
            }
        }
    }
}