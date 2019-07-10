pipeline {

    agent any

    parameters {
        string(name: 'tests', defaultValue: 'RunCucumberTest', description: 'cucumber tests')
        string(name: 'url', defaultValue: 'http://toolslist.safebear.co.uk:8080', description: 'test environment')
        string(name: 'browser', defaultValue: 'chrome_headless', description: 'chrome headless')
        string(name: 'sleep', defaultValue: '0', description: 'zero out any sleep commands')
    }

    triggers { pollSCM('* * * * *') } // poll the source code repo every minute.

    stages {

        stage('BDD Requirements Testing') {
            steps {
                bat "mvn -Dtest=${params.tests} test -Durl=${params.url} -Dbrowser=${params.browser} -Dsleep=${params.sleep}"
            }
            post {
                always {
                    bat "mvn cluecumber-report:reporting"
                    publishHTML([
                            allowMissing         : false,
                            alwaysLinkToLastBuild: false,
                            keepAll              : false,
                            reportDir            : 'target/generated-report',
                            reportFiles          : 'index.html',
                            reportName           : 'BDD Report',
                            reportTitles         : ''])
                }
            }
        }

    }
}