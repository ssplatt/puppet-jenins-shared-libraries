/* standard slack message for test failure
 */

def call() {
  slackSend color: 'danger', message: "${env.JOB_NAME} #${env.BUILD_NUMBER} - tests failed"
}
