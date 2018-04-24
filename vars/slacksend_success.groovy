/* standard slack message for test success
 */

def call() {
  slackSend color: 'good', message: "${env.JOB_NAME} #${env.BUILD_NUMBER} - tests succeeded"
}
