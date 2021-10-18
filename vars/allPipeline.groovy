def call(body) {
    def pipeLineParams = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipeLineParams
    body()

pipeLine {
    agent { label "master"}

    stages {
        stage ('Example Build#1') {
            steps {
            helloThere()
            }
        }
        stage ('Example Build#2') {
            steps {
            helloThere2()
            }
        }
        stage ('Example Build#3') {
        helloThere3()
        }
    }
  }
}



