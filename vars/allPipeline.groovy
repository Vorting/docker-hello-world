def call() {

    pipeline {
        agent { label "master"}

        stages {
            stage ('Example Build#1') {
                steps {
                    helloThere1()
                }
            }
            stage ('Example Build#2') {
                steps {
                    helloThere2()
                }
            }
            stage ('Example Build#3') {
                steps {
                    helloThere3()
                }
            }
        }
    }
}



